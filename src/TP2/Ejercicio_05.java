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

//Suma de Números Pares (while).
//Escribe un programa que solicite números al usuario y sume solo 
//los números pares. El ciclo debe continuar hasta que el usuario 
//ingrese el número 0, momento en el que se debe mostrar la suma
//total de los pares ingresados.

public class Ejercicio_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=1;
        int total_suma=0;
        while (num!=0){
            System.out.println("Ingrese un número (0 para terminar): ");
            num =input.nextInt();
            if (num%2==0){
                total_suma+=num;
            }
        }
        System.out.println("La suma de los números es: "+total_suma);
    }
    
}
