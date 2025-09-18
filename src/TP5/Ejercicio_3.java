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
         // Instanciamos los objetos de las clases Autor y Editorial
        Editorial editorial1 = new Editorial("Planeta","San Martin 1342");
        Autor autor1 = new Autor("Roberto Fontanarrosa", "Argentino");
        
        // Instanciamos un libro y le asociamos una editorial (relación de agregación)
        Libro libro1 = new Libro("Boogie, el aceitoso", "9789504933809",editorial1);
        
        // Mostramos los datos de la relación de agregación entre Libro y Editorial
        System.out.println("El libro '"+libro1.getTitulo()+"' pertenece a una edición de la editorial "+libro1.getEditorial().getNombre());
    
        // Asociamos un autor al libro (relación de asociación)
        libro1.setAutor(autor1);
        
        // Mostramos los datos de la relación de asociación entre Libro y Autor
        System.out.println("El libro '"+libro1.getTitulo()+"' tiene como autor, al escritor "+libro1.getAutor().getNombre());
    }
   
    
}
