package co.com.automatizacion.web.screenplay.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class PaginaSecundaria extends PageObject {
	
	
	public static final Target BTN_AGREGAR_CARRO= Target.the("Botón agregar carrito")
			.located(By.xpath("//a[@class='btn btn-success btn-lg']"));
	
	public static final Target MSG_PRODUCTO= Target.the("El producto seleccionado")
			.located(By.className("name"));
	
	
}
