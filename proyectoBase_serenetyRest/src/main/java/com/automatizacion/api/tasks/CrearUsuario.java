package com.automatizacion.api.tasks;

import com.automatizacion.api.endpoint.ObtenerEndpoint;
import com.automatizacion.api.utils.ConstruirCuerpo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;
import java.util.Map;

public class CrearUsuario  implements Task {


	private Map<String,String> datos;
    @Override

    public <T extends Actor> void performAs(T actor) {

    	String crearUsuario = ConstruirCuerpo.conLaPlantilla("src\\test\\resources\\templates\\Usuarios.json")
                .yLosValores(datos);
        actor.attemptsTo(Post.to(ObtenerEndpoint.obtenerEndpoint("crear_usuario"))
                .with(request -> request.header("Content-Type", "application/json")
                        .relaxedHTTPSValidation("TLS")
                        .body(crearUsuario))
                );
        

    }

    public static CrearUsuario crear() {
    	return Tasks.instrumented(CrearUsuario.class);
    }
	
	public CrearUsuario conLosDatos(Map<String, String> datos){
        this.datos = datos;
		return this;
    }
}
