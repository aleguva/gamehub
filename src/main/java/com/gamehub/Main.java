/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gamehub;

import java.util.ArrayList;
import java.util.List;

import com.gamehub.exception.GameHubFileException;
import com.gamehub.model.Videojuego;
import com.gamehub.repository.TextVideojuegoRepository;

/**
 *
 * @author Alejandro Guzman Vasquez
 */
public class Main {

    public static void main(String[] args) {

        //Borrar esto antes de entregar
        //=======
        System.out.println("Bienvenido a GameHub.");
        TextVideojuegoRepository tvr = new TextVideojuegoRepository();
        List<Videojuego> listaVideojuegos = new ArrayList<>();

        listaVideojuegos.add(new Videojuego(1, 
            "Mario Bross", 
            "NES", 
            "RPG", 
            10, 
            false));

        listaVideojuegos.add(new Videojuego(2, 
            "Final Fantasy",
            "Play Station 1", 
            "Aventura", 
            200, 
            true));

            try {
                tvr.guardar(listaVideojuegos);
            } catch (GameHubFileException e) {
                System.out.println(e.getMessage());
            }


        //=======
        //Borrar esto antes de entregar
        
    }
}
