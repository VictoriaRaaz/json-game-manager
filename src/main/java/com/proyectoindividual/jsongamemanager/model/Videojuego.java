
package com.proyectoindividual.jsongamemanager.model;

public class Videojuego {
    //ATRIBUTOS
    private int id;
    private String titulo;
    private String genero;
    private String plataforma;

    //CONSTRUCTOR
    public Videojuego(int id, String titulo, String genero, String plataforma) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.plataforma = plataforma;
    }
    

    //GETTERS Y SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
    
    
    
}
