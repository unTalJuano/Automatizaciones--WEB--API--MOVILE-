package co.com.automatizacion.web.screenplay.task;

import co.com.automatizacion.web.screenplay.Interactions.CambiarAlert;
import co.com.automatizacion.web.screenplay.ui.PaginaSecundaria;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AgregarAlCarrito implements Task {


	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(PaginaSecundaria.BTN_AGREGAR_CARRO),
				CambiarAlert.siguiente()
				);
		
	}
	
    public static AgregarAlCarrito agregar() {
        return new AgregarAlCarrito();
    }

	

}
