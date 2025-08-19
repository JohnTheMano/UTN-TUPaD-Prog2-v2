/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   
        int edad;
        
        System.out.println("Ingrese su edad");
        edad = input.nextInt();
               
        clasificaEdad(edad);
    }
    
    public static void clasificaEdad(int edad){
        if (edad<12){
            System.out.println("Eres un Niño");
        }
        else if (edad>=12 && edad<=17){
            System.out.println("Eres un Adolescente");
        }
        else if (edad>17 && edad <=59){
            System.out.println("Eres un Adulto");
        }
        else{
            System.out.println("Eres un adulto mayor");
        }
    }
}