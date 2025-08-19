/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Clasificación de Edad.
//Escribe un programa en Java que solicite al usuario su edad y
//clasifique su etapa de vida según la siguiente tabla:
//Menor de 12 años: "Niño"
//Entre 12 y 17 años: "Adolescente"
//Entre 18 y 59 años: "Adulto"
//60 años o más: "Adulto mayor"

package TP2;
import java.util.Scanner;

public class Ejercicio_03 {
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