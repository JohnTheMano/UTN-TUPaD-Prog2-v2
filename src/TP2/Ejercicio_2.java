/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   
        int num1, num2, num3, numero_mayor;
        
        System.out.println("Ingrese 3 números enteros");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        
        numero_mayor = numeroMayor(num1, num2, num3);
        
        System.out.println("El mayor de los 3 numeros es: " + numero_mayor);
    }
    
    public static int numeroMayor(int num1, int num2, int num3){
        int mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        return mayor;
    }
}
