package com.proyecto.pageobject.definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.proyecto.pageobject.steps.GoogleSearchStep;
import com.proyecto.pageobject.steps.ResultPageStep;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class GooglePageDefinition {

	@Steps
	GoogleSearchStep googleSeacrh;
	
	@Steps
	ResultPageStep resultStep;
	
	@Managed(driver = "chrome")
    WebDriver driver;
	
	@Given("^I’m on the homepage$")
	public void i_m_on_the_homepage() {
	   driver.get("https://www.google.com/");
	   googleSeacrh.enterTheGoogleSearch();
	}

	@When("^I type (.*) into the search field$")
	public void i_type_into_the_search_field(String text) {
	    googleSeacrh.typeIntoTheSearchField(text);
	}

	@When("^I click the Google Search button$")
	public void i_click_the_Google_Search_button() {
		googleSeacrh.clickButtonSearch();
	}
	
	@When("^I click on the first suggestion in the list$")
	public void i_click_on_the_first_suggestion_in_the_list() {
	    googleSeacrh.clickSuggestionList();
	}


	@Then("^the first result is (.*)$")
	public void the_first_result_is(String firstResult) {
	   googleSeacrh.verifyLink(firstResult);
	}

	@When("^I click on the first result link$")
	public void i_click_on_the_first_result_link() {
	    googleSeacrh.clickLink();
	}

	@Then("^I go to the page (.*)$")
	public void i_go_to_the_page(String result) {
	    resultStep.isDisplayed();
	}

}
