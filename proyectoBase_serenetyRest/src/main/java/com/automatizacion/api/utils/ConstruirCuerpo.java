package com.automatizacion.api.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class ConstruirCuerpo {
    private String plantillaRuta;

    public ConstruirCuerpo(String plantillaRuta) {
        this.plantillaRuta = plantillaRuta;
    }

    public static ConstruirCuerpo conLaPlantilla(String plantilla) {
        return new ConstruirCuerpo(plantilla);
    }
    
    public String yLosValores(Map<String, String> values) {
        String nuevaPlantilla = parseJson(plantillaRuta);
        for (Map.Entry<String, String> entry : values.entrySet()) {
            String k = entry.getKey();
            String v = entry.getValue();
            String key = "${" + k + "}";
            if (v == null) {
                v = "";
            }
            nuevaPlantilla = nuevaPlantilla.replace(key, v);
        }

        return nuevaPlantilla;
    }

    public String parseJson(String ruta) {
        String resultStr = "";
        try {
            resultStr = readFileAsString(ruta);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultStr;
    }

    public static String readFileAsString(String fileName) throws IOException {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

}
