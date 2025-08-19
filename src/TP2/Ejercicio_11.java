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

//Cálculo de descuento especial usando variable global.
//Declara una variable global Ejemplo de entrada/salida: = 0.10. 
//Luego, crea un método calcularDescuentoEspecial(double precio) 
//que use la variable global para calcular el descuento especial 
//del 10%.
//Dentro del método, declara una variable local descuentoAplicado,
//almacena el valor del descuento y muestra el precio final con descuento.

public class Ejercicio_11 {
    
    static double variable_global = 0.10;
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    double precio_ingresado = 0;
    double precio_final =0;
    double descuento_especial_aplicado =0;
    
    System.out.println("Ingrese el precio del producto: ");
    precio_ingresado = input.nextDouble();
    
    descuento_especial_aplicado = variable_global*precio_ingresado;
    System.out.println("El descuento especial aplicado es: "+descuento_especial_aplicado);
    
    calcularDescuentoEspecial(precio_ingresado);
    }
       
    public static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio*variable_global;
        System.out.println("El precio final con descuento es: "+(precio-descuentoAplicado));
        
    }
    
    
}
