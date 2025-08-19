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

//Actualización de stock a partir de venta y recepción de productos.
//Crea un método actualizarStock(int stockActual, int cantidadVendida,
//int cantidadRecibida), que calcule el nuevo stock después de una venta y 
//recepción de productos:
//NuevoStock = StockActual − CantidadVendida + CantidadRecibida
//NuevoStock = CantidadVendida + CantidadRecibida
//Desde main(), solicita al usuario el stock actual, la cantidad vendida
//y la cantidad recibida, y muestra el stock actualizado.

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stock_actual = 0;
        int cantidad_vendida = 0;
        int cantidad_recibida = 0;
        
        System.out.println("Ingrese el stock actual del producto:");
        stock_actual = input.nextInt();
        System.out.println("Ingrese la cantidad vendida:");
        cantidad_vendida = input.nextInt();
        System.out.println("Ingrese la cantidad recibida:");
        cantidad_recibida = input.nextInt();
        int resultado_stock =actualizarStock(stock_actual,cantidad_vendida,cantidad_recibida);
        System.out.println("El nuevo stock del producto es:"+resultado_stock);
    }
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }
}
