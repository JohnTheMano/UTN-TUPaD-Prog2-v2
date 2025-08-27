/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP3;

/**
 *
 * @author Win
 */
public class Ejercicio_05 {
    public static void main(String[] args) {
        NaveEspacial nave1 = new NaveEspacial();
        nave1.setNombre("Halcón Milenario");
        nave1.setCombustible(50);
        
        nave1.avanzar(80);
        nave1.despegar();
        nave1.avanzar(80);
        nave1.recargarCombustible(80);
        nave1.recargarCombustible(50);
        nave1.avanzar(80);
    }
    
}
