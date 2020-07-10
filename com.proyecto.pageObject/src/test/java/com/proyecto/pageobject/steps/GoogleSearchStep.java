package com.proyecto.pageobject.steps;

import com.proyecto.pageobject.pageobjects.GooglePage;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;

public class GoogleSearchStep {
	
	GooglePage googlePage;
	
	@Step
	public void enterTheGoogleSearch() 
	{
		googlePage.getClass().getAnnotation(DefaultUrl.class).value();  
		
	}
	
	@Step
	public void typeIntoTheSearchField(String text) 
	{
		googlePage.typeTheKeyword(text);
	}
	
	@Step
	public void clickButtonSearch() 
	{
		googlePage.clickTheButton();
	}
	
	@Step
	public void verifyLink(String text) 
	{
		googlePage.verifyText(text);
	}
	
	@Step
	public void clickLink() 
	{
		googlePage.clickLink();
	}
	
	@Step
	public void clickSuggestionList() 
	{
		googlePage.clickSuggestionList();
	}

}
