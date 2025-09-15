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
        //Primera parte:
        System.out.println("//Primera parte:");
        //Instanciamos un pasaporte
        Pasaporte pass = new Pasaporte("AU27490558","12/04/2000","primera_foto",".jpg");
        pass.mostrarPasaporte();
        pass.setFoto("segunda_foto", ".Tiff");
        pass.mostrarPasaporte();
        
        //Segunda parte:
        System.out.println("//Segunda parte:");
        //Instanciamos un titular
        Titular titular1 = new Titular("Oscar", "26450876");
        //Asociamos el objeto pasaporte a el objeto titular 
        titular1.setPasaporte(pass);
        pass.setTitular(titular1);
        //Visualizamos resultados
        System.out.println(titular1.getPasaporte().getNumero());
        titular1.getPasaporte().mostrarPasaporte();
        
        System.out.println(titular1);
        System.out.println(pass);
    }
}
