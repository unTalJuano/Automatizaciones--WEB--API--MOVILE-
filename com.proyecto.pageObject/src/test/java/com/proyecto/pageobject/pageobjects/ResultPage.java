package com.proyecto.pageobject.pageobjects;


import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com/")
public class ResultPage extends PageObject{
	
	@FindBy(name = "home")
	public WebElement menu_home;
	
	
	public void isDisplayed() 
	{
		menu_home.isDisplayed();
	}
	
	
}
