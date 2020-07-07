package co.com.automatizacion.web.screenplay.task;


import co.com.automatizacion.web.screenplay.ui.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


public class SeleccionarCategoria implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(PaginaPrincipal.CATEGORIA_LAPTOPS)
				);
		
	}
	
    public static SeleccionarCategoria seleccionarCategoria() {
        return new SeleccionarCategoria();
    }

	

}
