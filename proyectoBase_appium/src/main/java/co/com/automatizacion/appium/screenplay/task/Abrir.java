package co.com.automatizacion.appium.screenplay.task;

import co.com.automatizacion.appium.screenplay.ui.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Abrir implements Task {


	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(Home.APP_CALCULADORA));
	}
	
    public static Abrir app() {
        return Tasks.instrumented(Abrir.class);
    }

	

}
