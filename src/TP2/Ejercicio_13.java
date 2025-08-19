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
public class Ejercicio_13 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        int num=0;
        double[] precios = {199,99,299.5,149.75,399.0,89.99};
        
        System.out.println("Precios Originales: ");
        
        recorrerRecursivo(precios, 0);
        
        System.out.println("Ingrese la posicion del producto que quiere modificar: ");
        num=input.nextInt();
        modificarPrecio(precios,num);
        
        System.out.println("Precios modificados: ");
        recorrerRecursivo(precios, 0);
    }
    public static void modificarPrecio(double[] lista,int posicion){
        System.out.println("Ingrese el nuevo precio: ");
        double nuevo_precio = input.nextDouble();
        lista[posicion-1] = nuevo_precio;
    }
    public static void recorrerRecursivo(double[] lista, int posicion){
        if (posicion<lista.length){
            System.out.println("Precio: $" + lista[posicion]);
            recorrerRecursivo(lista,posicion+1);
        }    
    }
} 
