package com.automatizacion.api.utils;

import org.json.JSONObject;

public class ConvertirStringAJson {

    public static JSONObject responseJson;

    public static void cambiarStringAJson(String responseString){
        responseJson = new JSONObject(responseString);
    }
}
