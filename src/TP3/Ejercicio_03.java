/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP3;

/**
 *
 * @author Win
 */
public class Ejercicio_03 {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.setTitulo("Los trenes matan a los autos y otros cuentos");
        libro1.setAutor("Roberto Fontanarrosa");
        libro1.setAñoPublicacion(1994);
     
        libro1.getTitulo();
        libro1.getAutor();
        libro1.getAñoPublicacion();
        
        libro1.setAñoPublicacion(-20);
        libro1.getAñoPublicacion();
        libro1.setAñoPublicacion(1900);
        libro1.getAñoPublicacion();
    }
}
