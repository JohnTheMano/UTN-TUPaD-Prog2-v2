/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5;

/**
 *
 * @author Win
 */
public class Ejercicio_12 {
    public static void main(String[] args) {
        
        // Instanciamos un contribuyente con nombre y CUIL
        Contribuyente contribuyente_1 = new Contribuyente("Miguel Mateos","20-17546985-5");
        
        // Instanciamos un impuesto con un monto determinado
        Impuesto impuesto_1 = new Impuesto(952456.45);
        
        // Establecemos la relación de asociación unidireccional: Impuesto - Contribuyente
        impuesto_1.setContribuyente(contribuyente_1);
        
        // Instanciamos una calculadora
        Calculadora calculadora_1 = new Calculadora();
        
        // Mostramos el nombre del contribuyente y el monto del impuesto
        System.out.println("Nomnre del contribuyente: "+ impuesto_1.getContribuyente().getNombre()+" el monto total es de "+impuesto_1.getMonto());
        
         // Calculamos e imprimimos el impuesto - dependencia de uso
        calculadora_1.calcular(impuesto_1);      
        
        
        
        
    }
}
