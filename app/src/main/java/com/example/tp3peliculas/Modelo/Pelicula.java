package com.example.tp3peliculas.Modelo;

import java.io.Serializable;

public class Pelicula implements Serializable {
    private String titulo;
    private String resenia;
    private int foto;
    private String descripcion;
    private String actores;
    private String director;

    public Pelicula(String titulo, String resenia, int foto, String descripcion, String actores, String director) {
        this.titulo = titulo;
        this.resenia = resenia;
        this.foto = foto;
        this.descripcion = descripcion;
        this.actores = actores;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getResenia() {
        return resenia;
    }

    public int getFoto() {
        return foto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getActores() {
        return actores;
    }

    public String getDirector() {
        return director;
    }
}
