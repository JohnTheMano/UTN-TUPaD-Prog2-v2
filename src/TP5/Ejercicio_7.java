/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5;

/**
 *
 * @author Win
 */
public class Ejercicio_7 {
    
    public static void main(String[] args) {
        // Instanciamos un motor
        Motor motor_1 = new Motor("Naftero","ns152345468");
        
        // Instanciamos un vehículo y le pasamos el motor como parte de una relación de agregación
        Vehiculo vehiculo_1 = new Vehiculo("AH658BG","Peugeot 5008",motor_1);
        
        // Instanciamos un conductor
        Conductor conductor_1 = new Conductor("Marcos Di Palma","132355644");
        
        // Asociamos un conductor al vehículo
        vehiculo_1.setConductor(conductor_1);
        
        // Mostramos resultados por consola
        System.out.println("El vehículo "+vehiculo_1.getModelo()+" tiene un motor "+motor_1.getTipo()+" y es manejado por el piloto "+conductor_1.getNombre());
    }
    
    
}
