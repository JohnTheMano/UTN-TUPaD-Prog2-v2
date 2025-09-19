/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5;

/**
 *
 * @author Win
 */
public class Cancion {
    private String titulo;
    private Artista artista;

    public Cancion(String titulao) {
        this.titulo = titulao;
    }

    public String getTitulao() {
        return titulo;
    }

    public void setTitulao(String titulao) {
        this.titulo = titulao;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulao=" + titulo + ", artista=" + artista + '}';
    }
    
    
}
