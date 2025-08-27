/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP3;

/**
 *
 * @author Win
 */
public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    
    public void getTitulo(){
        System.out.println(titulo);
    }
    public void getAutor(){
        System.out.println();
    }
    public void getAñoPublicacion(){
        System.out.println(añoPublicacion);
    }
       public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setAñoPublicacion(int anio){
        if (anio > 0){
            this.añoPublicacion=anio;}
        }
}
