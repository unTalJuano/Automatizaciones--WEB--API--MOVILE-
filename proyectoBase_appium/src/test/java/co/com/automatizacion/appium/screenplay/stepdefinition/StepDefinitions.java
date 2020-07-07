package co.com.automatizacion.appium.screenplay.stepdefinition;





import co.com.automatizacion.appium.Questions.ElResultado;
import co.com.automatizacion.appium.screenplay.task.Abrir;
import co.com.automatizacion.appium.screenplay.task.Multiplicar;
import co.com.automatizacion.appium.screenplay.task.Restar;
import co.com.automatizacion.appium.screenplay.task.Sumar;
import co.com.automatizacion.appium.screenplay.util.MyDriver;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class StepDefinitions {

    @Before
    public void AbrirNavegador() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^ingresa a la calculadora$")
    public void ingresa_a_la_calculadora() throws Exception {
    	OnStage.theActorCalled("").can(BrowseTheWeb.with(MyDriver.appium()));
    	OnStage.theActorInTheSpotlight().attemptsTo(Abrir.app());
    }

    @Cuando("^suma el número (.*) con el (.*)$")
    public void suma_el_número_con_el(int num1, int num2) {
       OnStage.theActorInTheSpotlight().attemptsTo(Sumar.sumar().losNumeros(num1, num2));
    }
    
    @Cuando("^el usuario resta el número (.*) con el (.*)$")
    public void el_usuario_resta_el_número_con_el(int num1, int num2) {
    	OnStage.theActorInTheSpotlight().attemptsTo(Restar.restar().losNumeros(num1, num2));
    }
    
    @Cuando("^el usuario multiplica el número (.*) con el (.*)$")
    public void el_usuario_multiplica_el_número_con_el(int num1, int num2) {
    	OnStage.theActorInTheSpotlight().attemptsTo(Multiplicar.multiplicar().losNumeros(num1, num2));
    }

    @Entonces("^debe aparecer el resultado de (.*)$")
    public void debe_aparecer_el_resultado_de(int resul) {
    	OnStage.theActorInTheSpotlight().asksFor(ElResultado.enLaApp().es(resul));
    }

}
