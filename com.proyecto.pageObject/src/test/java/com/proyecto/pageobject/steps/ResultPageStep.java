package com.proyecto.pageobject.steps;


import com.proyecto.pageobject.pageobjects.ResultPage;
import net.thucydides.core.annotations.Step;

public class ResultPageStep {
	
	ResultPage resultPage;
	
	@Step
	public void isDisplayed() 
	{
		resultPage.isDisplayed();
		
	}

}
