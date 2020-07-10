package com.proyecto.pageobject.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com/")
public class GooglePage extends PageObject{
	
	@FindBy(name = "q")
	public WebElement lnk_search;
	
	@FindBy(name = "btnK")
	public WebElement btn_search;
	
	@FindBy(xpath="//h3[contains(text(),'The Books - Patrick Rothfuss')]")
	public WebElement lnk_result;
	
	@FindBy(xpath="//li[1]/div")
	public WebElement first_list;
	
	
	public void typeTheKeyword(String text) 
	{
		lnk_search.click();
		lnk_search.sendKeys(text);
	}
	
	public void clickTheButton() 
	{
		btn_search.click();
	}

	public void verifyText(String mensaje) 
	{
		mensaje= lnk_result.getText();
		assertThat(mensaje, containsText("The Books - Patrick Rothfuss"));
	}
	
	public void clickLink() 
	{		
		lnk_result.click();
	}

	public void clickSuggestionList() 
	{
		lnk_search.sendKeys(Keys.ARROW_DOWN);
		first_list.click();
		
	}
	
}
