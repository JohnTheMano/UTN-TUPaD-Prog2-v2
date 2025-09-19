/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5;

/**
 *
 * @author Win
 */
public class Ejercicio_10 {
    public static void main(String[] args) {
        // Instanciamos un titular de cuenta bancaria con nombre y DNI
        Titular titular_3 = new Titular("Giselle Rimolo","6.706.449");
        
        // Instanciamos una cuenta bancaria con CBU, saldo, clave y fecha de última modificación
        CuentaBancaria cuenta_3 = new CuentaBancaria("132213454686",2542165.50,"fake_medecine","21/03/2003");
        
        // Mostramos por consola los datos de la cuenta: CBU, fecha de modificación de la clave, DNI del titular y saldo
        System.out.println("La cuenta del CBU "+cuenta_3.getCbu() +" modifico su clave por ultima vez el "+cuenta_3.mostrarUltimaModificacion()+", el dni del titular es: " +titular_3.getDni()+ " y su saldo es de $"+cuenta_3.getSaldo());
    }
}
