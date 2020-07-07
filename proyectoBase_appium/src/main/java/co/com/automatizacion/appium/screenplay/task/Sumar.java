package co.com.automatizacion.appium.screenplay.task;

import org.openqa.selenium.By;

import co.com.automatizacion.appium.screenplay.ui.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class Sumar implements Task {

	int num1,num2;

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(Target.the("Primer número")
				.located(By.id("com.android.calculator2:id/digit_"+num1))),
				Click.on(Home.SIMBOLO_SUMA),
				Click.on(Target.the("Segund número")
						.located(By.id("com.android.calculator2:id/digit_"+num2))),
				Click.on(Home.SIMBOLO_IGUAL)
				);
	}
	
    public static Sumar sumar() {
        return Tasks.instrumented(Sumar.class);
    }
    
    public Sumar losNumeros(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
		return this;
	}

	

}
