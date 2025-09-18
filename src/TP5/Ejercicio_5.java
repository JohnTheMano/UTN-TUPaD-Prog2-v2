/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5;

/**
 *
 * @author Win
 */
public class Ejercicio_5 {
    public static void main(String[] args) {
        // Instanciamos un propietario con nombre y DNI
        Propietario propietario = new Propietario("Ferris", "32123456");
        
        // Instanciamos una computadora con marca, número de serie, modelo de placa madre y procesador
        Computadora computadora = new Computadora("HP", "SN123", "ASUS U6540", "AMD 3778");
        
         // Establecemos la asociación bidireccional entre el propietario y la computadora
        computadora.setPropietario(propietario);
        propietario.setComputadora(computadora);
        
         // Mostramos los datos del propietario y la computadora por consola
        System.out.println(propietario);
        System.out.println(computadora);
    }
}
