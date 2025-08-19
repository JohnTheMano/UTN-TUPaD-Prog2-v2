/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;

import java.util.Scanner;

public class Ejercicio_1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    
        int anio;

        System.out.println("Ingrese año a verificar:");
        anio = input.nextInt();

        mostrarResultado(esBisiesto(anio), anio);
    }

    public static boolean esBisiesto(int n){
        return (n % 4 == 0 && n % 100 != 0) || (n % 400 == 0);   
    }

    public static void mostrarResultado(boolean esBisiesto, int anio){
        if (esBisiesto) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
    }
}
