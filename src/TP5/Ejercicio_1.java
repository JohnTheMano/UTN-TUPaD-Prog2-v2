/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5;

/**
 *
 * @author Win
 */
public class Ejercicio_1 {
    public static void main(String[] args) {
        // Primera parte: creamos y modificamos un pasaporte
        System.out.println("//Primera parte:");
        
        // Instanciamos un pasaporte con número, fecha de emisión, nombre y extensión de foto
        Pasaporte pass = new Pasaporte("AU27490558","12/04/2000","primera_foto",".jpg");
        
        // Mostramos los datos iniciales del pasaporte  
        pass.mostrarPasaporte();
        
        // Modificamos la foto del pasaporte
        pass.setFoto("segunda_foto", ".Tiff");
        
        // Mostramos los datos actualizados del pasaporte
        pass.mostrarPasaporte();
        
        // Segunda parte: asociamos un titular al pasaporte (relación bidireccional)
        System.out.println("//Segunda parte:");
        
        // Instanciamos un titular con nombre y DNI
        Titular titular1 = new Titular("Oscar", "26450876");
        
        // Establecemos la asociación bidireccional entre titular y pasaporte 
        titular1.setPasaporte(pass);
        pass.setTitular(titular1);
        
        // Visualizamos el número del pasaporte desde el titular y mostramos el pasaporte completo
        System.out.println(titular1.getPasaporte().getNumero());
        titular1.getPasaporte().mostrarPasaporte();
        
        // Mostramos los datos del titular y del pasaporte
        System.out.println(titular1);
        System.out.println(pass);
    }
}
