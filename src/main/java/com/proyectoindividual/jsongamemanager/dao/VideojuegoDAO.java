package com.proyectoindividual.jsongamemanager.dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.proyectoindividual.jsongamemanager.model.Videojuego;
import java.io.File;
import java.util.List;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class VideojuegoDAO {
    private static final String RUTA = "videojuegos.json";

    public static List<Videojuego> cargarVideojuegos() {
        try {
            File archivo = new File(RUTA);

            if (!archivo.exists()) {
                return new ArrayList<>();
            }

            Gson gson = new Gson();

            try (FileReader reader = new FileReader(RUTA)) {
                List<Videojuego> videojuegos = gson.fromJson(
                        reader,
                        new TypeToken<List<Videojuego>>() {}.getType()
                );

                return videojuegos != null ? videojuegos : new ArrayList<>();
            }

        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    public static void guardarVideojuegos(List<Videojuego> videojuegos) throws Exception {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(RUTA)) {
            gson.toJson(videojuegos, writer);
        }
    }

}
