package com.automatizacion.api.endpoint;

public class ObtenerEndpoint {

    private static final String BUSCAR_USUARIOS = "api/users/";
    private static final String CREAR_USUARIO = "api/users";
    private static final String ACTUALIZAR_USUARIO = "api/users/";

    public static String obtenerEndpoint(String endpoint){
        switch (endpoint){
            case "buscar_usuarios":
                return BUSCAR_USUARIOS;
            case "crear_usuario":
            	return CREAR_USUARIO;
            case "actualizar_usuario":
            	return ACTUALIZAR_USUARIO;
            default:
                break;
        }
        return "";
    }
}
