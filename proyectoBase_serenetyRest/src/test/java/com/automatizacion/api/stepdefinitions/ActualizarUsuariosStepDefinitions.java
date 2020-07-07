package com.automatizacion.api.stepdefinitions;


import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.automatizacion.api.tasks.ActualizarUsuario;
import com.automatizacion.api.tasks.ServicioBuscarUsuario;


import java.util.List;
import java.util.Map;


import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;

import io.restassured.parsing.Parser;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;

public class ActualizarUsuariosStepDefinitions {

    private EnvironmentVariables envVars;

    @Before
    public void preparacionDelEscenario() throws IllegalAccessException{
    	String baseUrl = envVars.optionalProperty("restapi.baseurl").orElseThrow(IllegalAccessException::new);
        setTheStage(new OnlineCast());
        SerenityRest.setDefaultParser(Parser.JSON);
        theActorCalled("El analista").whoCan(CallAnApi.at(baseUrl));
    }
    
    @Dado("el usuario desea consumir el servicio single user con el id (.*) para verificar que existe")
    public void elUsuarioDeseaConsumirElServicioSingleUserConElIdParaVerificarQueExiste(Integer id) {
    	theActorInTheSpotlight().attemptsTo(ServicioBuscarUsuario.llamarServicio().actualizar(id));
    }

    @Cuando("el usuario envia la petición para actualizar el usuario (.*) con los datos:")
    public void elUsuarioEnviaLaPeticiónParaActualizarElUsuarioConLosDatos(Integer id,List<Map<String ,String>> datos) {
    	theActorInTheSpotlight().attemptsTo(ActualizarUsuario.actualizar().conLosDatos(id,datos.get(0)));
    }

}