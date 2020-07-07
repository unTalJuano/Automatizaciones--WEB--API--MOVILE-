package com.automatizacion.api.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\usuarios.feature",
        glue = "com.automatizacion.api.stepdefinitions", snippets = SnippetType.CAMELCASE, tags= {""})
public class RunnerTest {

}
