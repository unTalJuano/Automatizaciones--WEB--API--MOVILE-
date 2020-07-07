package co.com.automatizacion.web.screenplay.stepdefinition;

import co.com.automatizacion.web.screenplay.Questions.ElMensaje;
import co.com.automatizacion.web.screenplay.task.AgregarAlCarrito;
import co.com.automatizacion.web.screenplay.task.SeleccionarCategoria;
import co.com.automatizacion.web.screenplay.task.SeleccionarProducto;
import co.com.automatizacion.web.screenplay.util.MyDriver;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class StepDefinitions {

    @Before
    public void AbrirNavegador(){
        OnStage.setTheStage(new OnlineCast());
    }
    
    @Dado("^El (.*) abre al navegador e ingresa a la página$")
    public void el_usuario_abre_al_navegador_e_ingresa_a_la_página(String usuario) {
    	OnStage.theActorCalled(usuario).can(BrowseTheWeb.with(MyDriver.chrome()));
    }


    @Dado("^El usuario desea comprar una laptops$")
    public void el_usuario_desea_comprar_una_laptops() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarCategoria.seleccionarCategoria());
    }

    @Cuando("^Selecciona el computador (.*)$")
    public void selecciona_el_computador(String producto) {
    	OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarProducto.seleccionarProducto().seleccionarProductoCon(producto));
    }
    
    @Cuando("^agrega el producto al carro de compras$")
    public void agrega_el_producto_al_carro_de_compras() {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarAlCarrito.agregar());
    }

   @Entonces("^Verifica la compra del computador seleccionado con el (.*)$")
    public void realiza_la_compra_del_computador_seleccionado(String mensaje) throws InterruptedException {
	   Thread.sleep(1000);
       OnStage.theActorInTheSpotlight().asksFor(ElMensaje.enLaPagina().es(mensaje));
    }

    

}
