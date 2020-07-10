package com.proyecto.pageobject.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/googlePage.feature",
        tags= "@scenario2",
        glue="com.proyecto.pageobject.definitions")

public class RunnerFeatures {
}

