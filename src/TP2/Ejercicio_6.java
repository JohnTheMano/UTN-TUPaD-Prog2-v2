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

//Contador de Positivos, Negativos y Ceros (for).
//Escribe un programa que pida al usuario ingresar 10 números enteros 
//y cuente cuántos son positivos, negativos y cuántos son ceros.

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int positivos=0,negativos=0,ceros=0,num=0;
        for (int i=1; i<11;i++){
            System.out.println("Ingrese el numero: "+i);
            num=input.nextInt();
            if (num<0){
                negativos+=1;
            }
            else if(num>0){
                positivos+=1;
            }
            else ceros+=1
                    ;
        }
        System.out.println(
            "Resultados:\n"+ 
            "Positivos: "+positivos+"\n" +
            "Negativos: "+negativos+"\n" +
            "Ceros: "+ceros);
    }
}
