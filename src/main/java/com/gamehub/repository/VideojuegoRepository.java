/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamehub.repository;

import com.gamehub.model.Videojuego;
import com.gamehub.exception.GameHubFileException;
import java.util.List;

/**
 *
 * @author Alejandro Guzman Vasquez
 */
public interface VideojuegoRepository {

        List<Videojuego> cargar() throws GameHubFileException;
        
        void guardar(List<Videojuego> videojuegos) throws GameHubFileException;
        
        
}
