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
        Propietario propietario = new Propietario("Ferris", "32123456");
        Computadora computadora = new Computadora("HP", "SN123", "ASUS U6540", "AMD 3778");

        computadora.setPropietario(propietario);

        System.out.println(propietario);
        System.out.println(computadora);
    }
}
