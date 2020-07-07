package co.com.automatizacion.web.screenplay.Interactions;

import java.util.Set;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CambiarAlert implements Interaction{
	
	public CambiarAlert() {
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		Set<String> handles = BrowseTheWeb.as(actor).getDriver().getWindowHandles();
		
		for(String handle : handles) {
			BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();
		}
		
	}
	
	public static CambiarAlert siguiente() {
		return new CambiarAlert();
	}


	

}
