package com.c7.ecommerce;

import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import org.junit.jupiter.api.Test;

public class GeneralArchRulesTest {

    @Test
    public void servicesAndRepositoriesShouldNotDependOnControllers() {
        ArchRule rule = ArchRuleDefinition.noClasses()
                .that().resideInAPackage("..service..")
                .or().resideInAnyPackage("..repository..")
                .should().dependOnClassesThat()
                .resideInAPackage("..controller..");
        rule.check(new ClassFileImporter().importPackages("com.c7"));
    }

    @Test
    public void controllersShouldNotDependOnRepositories() {
        ArchRule rule = ArchRuleDefinition.noClasses()
                .that().resideInAnyPackage("..controller..")
                .should().dependOnClassesThat()
                .resideInAnyPackage("..repository..");
        rule.check(new ClassFileImporter().importPackages("com.c7"));
    }
}
