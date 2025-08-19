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

//Validación de Nota entre 0 y 10 (do-while).
//Escribe un programa que solicite al usuario una nota 
//entre 0 y 10. Si el usuario ingresa un número fuera de este 
//rango, debe seguir pidiéndole la nota hasta que ingrese un valor válido.

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota =0;
        do{
           System.out.println("Ingrese una nota (0-10):");
           nota=input.nextInt();
           if(nota<0 || nota>10){
               System.out.println("Nota inválida. Ingrese una nota entre 0 y 10.");
           }
           else System.out.println("Nota guardada correctamente.");
        }
        while(nota<0 || nota>10);
    }
}
