package com.gamehub.repository;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
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

        File fichero = new File(FILE_PATH);
        File carpeta = fichero.getParentFile();

        if (!carpeta.isDirectory()) {
            if (!carpeta.mkdir()) {
                throw new GameHubFileException("No se pudo crear la carpeta " + carpeta.getAbsolutePath());
            }
        }

        try (ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream(fichero))) {
            flujoSalida.writeObject(new ArrayList<>(videojuegos));
        } catch (IOException e) {
            throw new GameHubFileException("No se pudo guardar el fichero " + fichero.getAbsolutePath(), e);
        }
    }

}
