package co.com.automatizacion.web.screenplay.task;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarProducto implements Task {


	public String producto;
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(Target.the("Selecciona producto")
				.located(By.xpath("//a[contains(text(),"+producto+")]")))
				);
		
	}
	
    public static SeleccionarProducto seleccionarProducto() {
    	return Tasks.instrumented(SeleccionarProducto.class);
    }
    
   public SeleccionarProducto seleccionarProductoCon(String producto) 
    {
    	this.producto=producto;
    	return this;
    }

}
