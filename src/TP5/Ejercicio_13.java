/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5;

/**
 *
 * @author Win
 */
public class Ejercicio_13 {
    public static void main(String[] args) {
        
         // Instanciamos un usuario con nombre y email
        Usuario usuario_1 = new Usuario("Lucas Gamba","lugam@gmail.com");

        // Instanciamos un generador de QR
        GeneradorQR generador = new GeneradorQR();

        // Llamamos al método generar (dependencia de creación)
        generador.generar("fdgsasd64161", usuario_1);
    }
}
