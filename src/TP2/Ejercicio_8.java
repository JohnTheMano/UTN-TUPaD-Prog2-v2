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
//Cálculo del Precio Final con impuesto y descuento.
//Crea un método calcularPrecioFinal(double impuesto, double descuento) 
//que calcule el precio final de un producto en un e-commerce. La fórmula es:
//PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
//PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento)
//Desde main(), solicita el precio base del producto, el porcentaje de 
//impuesto y el porcentaje de descuento, llama al método y muestra el precio final.

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precioBase = 0;
        double impuesto = 0;
        double descuento =0;
        double precioFinal=0;
        
        System.out.println("Ingrese el precio base del producto: ");
        precioBase = input.nextDouble();
        System.out.println("Ingrese el impuesto en porcentaje: ");
        impuesto = input.nextDouble()/100;
        System.out.println("Ingrese el descuento en porcentaje: ");
        descuento = input.nextDouble()/100;
        calcularPrecioFinal(precioBase,impuesto,descuento);
    }
    
     static void calcularPrecioFinal(double precioBase, double impuesto, double descuento){
        double precioFinal = precioBase + (precioBase*impuesto) - (precioBase*descuento);
        System.out.println("El precio final del producto es: "+precioFinal);
        
    }
    
}
