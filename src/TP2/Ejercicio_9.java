/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;

import java.util.Scanner;

/**
 *
 * @author Win
 */

//*Composición de funciones para calcular costo de envío y total de compra.*

//a. calcularCostoEnvio(double peso, String zona): Calcula el costo de envío
//basado en la zona de envío (Nacional o Internacional) y el peso del paquete.
//Nacional: $5 por kg
//Internacional: $10 por kg

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        double precioProducto=0;
        double pesoProducto=0;
        String zonaProducto;
        
        System.out.println("Ingrese el precio del producto: ");
        precioProducto = input.nextDouble();
        
        System.out.println("Ingrese el peso del paquete en kg: ");
        pesoProducto = input.nextDouble();
        input.nextLine();
        
        System.out.println("Ingrese la zona de envío (Nacional/Internacional):");
        zonaProducto = input.nextLine();
        
        calcularTotalCompra(precioProducto,pesoProducto,zonaProducto);
    }
    static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equals("Nacional")){
            return peso*5;
        }
        else if (zona.equals("Internacional")){
            return peso*10;
        }
        else 
            return 0;
            
    }
    static void calcularTotalCompra(double precioProducto, double peso, String zona){
        double total = calcularCostoEnvio(peso, zona)+ precioProducto;
        System.out.println("El costo de envío es: "+total);
    }
}
