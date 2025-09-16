/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5;

/**
 *
 * @author Win
 */
public class Ejercicio_4 {
    public static void main(String[] args) {
        //instanciamos banco
        Banco banco1 = new Banco("Galicia","20-93777916-0");        
        
        //instanciamos tarjeta de credito 
        TarjetaDeCredito tarjetaDeCredito1 = new TarjetaDeCredito("8302-2132-1123-1323","23/12/2029",banco1);
        
        //instanciamos cliente
        Cliente cliente1 = new Cliente("Victorio Falso","93777916");
        
        //Asociación Cliente - Tarjeta de Crédito
        cliente1.setTarjetaDeCredito(tarjetaDeCredito1);
        
        //Asociación Tarjeta de Crédito - Cliente
        tarjetaDeCredito1.setCliente(cliente1);
        
        //Visualizamos resultados de Asociacion bidireccional y agregación
        System.out.println(tarjetaDeCredito1);
        
        
        
                
        
        
        
    }
}
