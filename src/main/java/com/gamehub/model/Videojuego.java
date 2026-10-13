package com.gamehub.model;

import java.io.Serializable;

/**
 *
 * @author Alejandro Guzman Vasquez
 */
public class Videojuego implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String titulo;
    private String plataforma;
    private String genero;
    private double horasJugadas;
    private boolean finalizado;

    public Videojuego(int id, String titulo, String plataforma, String genero, double horasJugadas, boolean finalizado) {
        this.id = id;
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.genero = genero;
        this.horasJugadas = horasJugadas;
        this.finalizado = finalizado;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public double getHorasJugadas() {
        return horasJugadas;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setHorasJugadas(double horasJugadas) {
        this.horasJugadas = horasJugadas;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    @Override
    public String toString() {
        return "Videojuego{" + "id=" + id + ", titulo=" + titulo + ", plataforma=" + plataforma + ", genero=" + genero + ", horasJugadas=" + horasJugadas + ", finalizado=" + finalizado + '}';
    }
}
