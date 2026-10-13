/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamehub.repository;

import com.gamehub.exception.GameHubFileException;
import com.gamehub.model.Videojuego;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
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
        throw new GameHubFileException("No se pudo guardar el fichero ");

    }

    @Override
    public void guardar(List<Videojuego> videojuegos) throws GameHubFileException {
        File fichero = new File(FILE_PATH);
        File carpeta = fichero.getParentFile();

        if (!carpeta.isDirectory()) {
            if (!carpeta.mkdir()) {
                throw new GameHubFileException("No se pudo crear la carpeta " + carpeta.getAbsolutePath());
            }
        }
        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter(fichero, StandardCharsets.UTF_8))) {
            for (Videojuego videojuego : videojuegos) {
                bw.write(aLinea(videojuego));
                bw.newLine();
            }

        } catch (IOException ex) {
            throw new GameHubFileException("No se pudo guardar el fichero " + fichero.getAbsolutePath(), ex);
        }
    }
}
