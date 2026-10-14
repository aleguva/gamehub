package com.gamehub.repository;

import java.util.List;

import com.gamehub.exception.GameHubFileException;
import com.gamehub.model.Videojuego;

public class BinaryVideojuegoRepository implements VideojuegoRepository {

    private static final String FILE_PATH = "data/videojuegos.dat";

    @Override
    public List<Videojuego> cargar() throws GameHubFileException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cargar'");
    }

    @Override
    public void guardar(List<Videojuego> videojuegos) throws GameHubFileException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardar'");
    }

}
