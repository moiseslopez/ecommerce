package com.c7.ecommerce.infrastructure;

import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import org.junit.jupiter.api.Test;

public class InfrastructureArchRulesTest {

    @Test
    public void onlyInfrastructureLayerShouldAccessExternalLibraries() {//Failed
        ArchRule rule = ArchRuleDefinition.classes()
                .that().resideInAPackage("..infrastructure..")
                .should().onlyHaveDependentClassesThat().resideInAnyPackage(
                        "..infrastructure..", "..domain..", "..application..")
                .orShould().onlyHaveDependentClassesThat().haveNameMatching(".*Test")
                .orShould().dependOnClassesThat().haveNameMatching(".*Repository");
        rule.check(new ClassFileImporter().importPackages("com.c7"));
    }
}
