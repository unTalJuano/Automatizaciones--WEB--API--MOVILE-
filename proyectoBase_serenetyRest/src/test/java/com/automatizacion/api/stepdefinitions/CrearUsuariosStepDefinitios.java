package com.automatizacion.api.stepdefinitions;


import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import com.automatizacion.api.tasks.CrearUsuario;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.*;
import java.util.List;
import java.util.Map;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import io.restassured.parsing.Parser;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;

public class CrearUsuariosStepDefinitios {

    private EnvironmentVariables envVars;

    @Before
    public void preparacionDelEscenario() throws IllegalAccessException{
    	String baseUrl = envVars.optionalProperty("restapi.baseurl").orElseThrow(IllegalAccessException::new);
        setTheStage(new OnlineCast());
        SerenityRest.setDefaultParser(Parser.JSON);
        theActorCalled("El usuario").whoCan(CallAnApi.at(baseUrl));
    }
    
    @Cuando("el usuario envia la petición para crear el usuario con los datos:")
    public void elUsuarioEnviaLaPeticiónParaCrearElUsuarioConLosDatos(List<Map<String ,String>> datos) {
        theActorInTheSpotlight().attemptsTo(CrearUsuario.crear().conLosDatos(datos.get(0)));
    }

    @Entonces("el deberia ver que la respuesta es un codigo (.*) con el nombre (.*)")
    public void elDeberiaVerQueLaRespuestaEsUnCodigoConElNombre(Integer codigo, String nombre) {
    	theActorInTheSpotlight().should(seeThatResponse(lastresponse -> lastresponse.statusCode(codigo)
                .body("name", comparesEqualTo(nombre))));
    }


}