/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_adicionales;

/**
 *
 * @author Win
 */
public class Libro {
    private String titulo = "";
    private String autor = "";
    private static String editorial = "Independiente";
    
    /*Setters*/
    public void setTitulo(String titulo){
        this.titulo = titulo;
    };
    public void setAutor(String autor){
        this.autor = autor;
    };
    public void setEditorial(String editorial){
        this.editorial = editorial;
    };
    
    
    
    /*Getters*/    
    public String getTitulo(){
        return this.titulo;
    };
    public String getAutor(){
        return this.autor;
    };
    public String getEditorial(){
        return this.editorial;
    };
    
}
