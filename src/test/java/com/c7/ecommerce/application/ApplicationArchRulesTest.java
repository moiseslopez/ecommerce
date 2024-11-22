package com.c7.ecommerce.application;

import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import org.junit.jupiter.api.Test;

public class ApplicationArchRulesTest {

    @Test
    public void applicationShouldNotDependOnInfrastructure() {
        ArchRule rule = ArchRuleDefinition.noClasses()
                .that().resideInAnyPackage("..application..")
                .should().dependOnClassesThat()
                .resideInAnyPackage("..infrastructure..");
        rule.check(new ClassFileImporter().importPackages("com.c7"));
    }
}
