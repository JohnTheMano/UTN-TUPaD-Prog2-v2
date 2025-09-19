/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5;

/**
 *
 * @author Win
 */
public class Ejercicio_11 {
    public static void main(String[] args) {
        
        // Instanciamos un artista con nombre y género musical
        Artista artista_1 = new Artista("Smashmouth","Chamamé");
        
        // Instanciamos una canción con título
        Cancion cancion_1 = new Cancion("Nostalgias de mi niñéz en Somalia");
        
        // Establecemos una relación de asociación unidireccional: Cancion - Artista
        cancion_1.setArtista(artista_1);
        
        // Instanciamos un reproductor
        Reproductor diskMan = new Reproductor();
        
        // Reproducimos la canción - dependencia de uso
        diskMan.reproducir(cancion_1);
    }
}
