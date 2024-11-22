package com.c7.ecommerce.domain;

import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import org.junit.jupiter.api.Test;

public class DomainArchRulesTest {

    @Test
    public void domainShouldNotDependOnApplication() {
        ArchRule rule = ArchRuleDefinition.noClasses()
                .that().resideInAPackage("..domain..")
                .should().dependOnClassesThat()
                .resideInAnyPackage("..application..");
        rule.check(new ClassFileImporter().importPackages("com.c7"));
    }

    @Test
    public void domainShouldNotDependOnInfrastructure() {
        ArchRule rule = ArchRuleDefinition.noClasses()
                .that().resideInAnyPackage("..domain..")
                .should().dependOnClassesThat()
                .resideInAnyPackage("..infrastructure..");
        rule.check(new ClassFileImporter().importPackages("com.c7"));
    }

    @Test
    public void boundedContextShouldBeIndependent() {
        ArchRule rule = ArchRuleDefinition.noClasses()
                .that().resideInAPackage("..pedido..")
                .should().dependOnClassesThat()
                .resideInAPackage("..facturacion..");
        rule.check(new ClassFileImporter().importPackages("com.c7"));
    }

    @Test
    public void domainShouldDependOnRepositoryInterfaces() {
        ArchRule rule = ArchRuleDefinition.noClasses()
                .that().resideInAPackage("..domain..")
                .should().dependOnClassesThat().resideInAPackage("..persistence.repository..");
        rule.check(new ClassFileImporter().importPackages("com.c7"));
    }
}
