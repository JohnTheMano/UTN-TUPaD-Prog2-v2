/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5;

/**
 *
 * @author Win
 */
public class Ejercicio_3 {
    
    
    public static void main(String[] args) {
         //Instanciamos los objetos de las clases
        Editorial editorial1 = new Editorial("Planeta","San Martin 1342");
        Autor autor1 = new Autor("Roberto Fontanarrosa", "Argentino");
        //Agregación Libro - Editorial
        Libro libro1 = new Libro("Boogie, el aceitoso", "9789504933809",editorial1);
        //Visualizamos resultados de agregación Libro - Editorial
        System.out.println("El libro '"+libro1.getTitulo()+"' pertenece a una edición de la editorial "+libro1.getEditorial().getNombre());
    
        //Asociamos Libro - Autor
        libro1.setAutor(autor1);
        //Visualizamos Asociacion Libro - Autor
        System.out.println("El libro '"+libro1.getTitulo()+"' tiene como autor, al escritor "+libro1.getAutor().getNombre());
    }
   
    
}
