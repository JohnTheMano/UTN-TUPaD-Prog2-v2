/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5;

/**
 *
 * @author Win
 */
public class Ejercicio_6 {
    public static void main(String[] args) {
        
        
        //instanciamos un cliente
        Cliente cliente2 = new Cliente("Reggie Miller","26451789"); 
        
        //Instanciamos una mesa
        Mesa mesa1 = new Mesa("23",6);
        
        // Instanciamos una reserva y le pasamos la mesa como parte de una relación de agregación      
        Reserva reserva1 = new Reserva("21/05/2026","21:00",mesa1);
        
        //Asociamos un cliente a la reserva
        reserva1.setCliente(cliente2);
        
        //Mostramos resultados por consola
        System.out.println(cliente2+"\n"+reserva1);
    }
}
