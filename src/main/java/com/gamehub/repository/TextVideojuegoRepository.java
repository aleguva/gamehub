/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamehub.repository;

import com.gamehub.exception.GameHubFileException;
import com.gamehub.model.Videojuego;
import java.io.File;
import java.util.List;

/**
 *
 * @author Alejandro Guzman Vasquez
 */
public class TextVideojuegoRepository implements VideojuegoRepository {
    
    private static final String FILE_PATH = "data/videojuegos.txt";
    private static final String SEPARATOR = ":";
    
    private String aLinea(Videojuego videojuego) {
        int id = videojuego.getId();
        String titulo = videojuego.getTitulo();
        String plataforma = videojuego.getPlataforma();
        String genero = videojuego.getGenero();
        double horasJugadas = videojuego.getHorasJugadas();
        boolean finalizado = videojuego.isFinalizado();
        
        return id + SEPARATOR + titulo + SEPARATOR + plataforma + SEPARATOR + genero + SEPARATOR + horasJugadas + SEPARATOR + finalizado;
    }

    @Override
    public List<Videojuego> cargar() throws GameHubFileException {
        
    }

    @Override
    public void guardar(List<Videojuego> videojuegos) throws GameHubFileException {
    // 1.Asegurarse de que existe la carpeta data/. Recuerda que Java crea ficheros, pero no carpetas. 
    // Pista: la clase File tiene un método para crear directorios; repasa la tabla de la página 7 de los apuntes.
    File dataPath = new File(String );
    if (!dataPath.isDirectory()) {
        dataPath.mkdir
    }
    // 2.Abrir el fichero para escribir sobrescribiendo (no en modo append), en UTF-8 y por líneas. Mira el ejemplo “Escritura desde cero” de la página 16.
    // 3.Recorrer la lista y escribir cada videojuego con tu aLinea, seguido de un salto de línea.
    // 4.Usar try-with-resources (página 17) para que el fichero se cierre siempre.
    // 5.Si salta una IOException, capturarla y lanzar tu GameHubFileException con un mensaje claro y la causa.
    }    
}
