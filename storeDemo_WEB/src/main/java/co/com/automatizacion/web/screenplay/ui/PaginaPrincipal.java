package co.com.automatizacion.web.screenplay.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class PaginaPrincipal extends PageObject {
	
	public static final Target CATEGORIA_LAPTOPS= Target.the("Categoria Laptops")
			.located(By.xpath("//a[contains(text(),'Laptops')]"));
	
}
