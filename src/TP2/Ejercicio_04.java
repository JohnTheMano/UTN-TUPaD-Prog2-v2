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

//Calculadora de Descuento según categoría.
//Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
//Luego, aplique los siguientes descuentos:
//Categoría A: 10% de descuento
//Categoría B: 15% de descuento
//Categoría C: 20% de descuento
//El programa debe mostrar el precio original, el descuento aplicado y el precio final

public class Ejercicio_04 {
    public static void main(String[] args) {
        float precio,descuento;
        char categ;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        precio = input.nextFloat();
        
        System.out.println("Ingrese la categoria del producto A, B o C): ");
        categ=input.next().charAt(0);
        categ = Character.toUpperCase(categ);
        
        descuento = clasificarCategoria(categ);
        float precioFinal = aplicarDescuento(precio,descuento);
        
        System.out.println("Precio original: $" +precio+" \n Descuento aplicado: "+descuento+"% \n Precio final: $ "+ precioFinal);
        
        
    }
    public static float aplicarDescuento(float precio, float descuento) {
        return precio - (precio*(descuento/100)); 
    }
    public static int clasificarCategoria(char categoria){
       
        switch(categoria){
            case 'A':
                return 10;
                
            case 'B':
                return 15;
                
            case 'C':
                return 20;
            
            default: 
                return 0;    
        }
    }
}

