package co.com.automatizacion.web.screenplay.Questions;

import org.openqa.selenium.WebDriver;

import co.com.automatizacion.web.screenplay.ui.PaginaSecundaria;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElMensaje implements Question<String>{

	WebDriver driver;
	String mensajeComparar;
	String mensaje;
	
	@Override
	public String answeredBy(Actor actor) {
		
		if(mensaje.equals("Dell i7 8gb")) 
		{
			return Text.of(PaginaSecundaria.MSG_PRODUCTO).viewedBy(actor).asString();
		}
		
		return null;
	}
	
	public static ElMensaje enLaPagina() {
		return new ElMensaje();
	}
	
	public ElMensaje es(String mensaje) {
		this.mensaje=mensaje;
		return this;
	}


	
	

}
