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

//Arrays y Recursividad:
//12. Modificación de un array de precios y visualización de resultados.
//Crea un programa que:
//a. Declare e inicialice un array con los precios de algunos productos.
//b. Muestre los valores originales de los precios.
//c. Modifique el precio de un producto específico.
//d. Muestre los valores modificados.

public class Ejercicio_12 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        int num=0;
        double[] precios = {199,99,299.5,149.75,399.0,89.99};
        
        System.out.println("Precios Originales: ");
        
        recorrerPrecios(precios);
        
        System.out.println("Ingrese la posicion del producto que quiere modificar: ");
        num=input.nextInt();
        modificarPrecio(precios,num);
        
        System.out.println("Precios modificados: ");
        recorrerPrecios(precios);
    }
    public static void modificarPrecio(double[] lista,int posicion){
        System.out.println("Ingrese el nuevo precio: ");
        double nuevo_precio = input.nextDouble();
        lista[posicion-1] = nuevo_precio;
    }
    public static void recorrerPrecios(double[] lista){
        for(double precio : lista){
            System.out.println("Precio: $" + precio);
        }    
    }
}   
