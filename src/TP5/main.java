/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5;

/**
 *
 * @author Win
 */
public class main {
    public static void main(String[] args) {
        Pasaporte pass = new Pasaporte("AU27490558","12/04/2000","primera_foto",".jpg");
        pass.mostrarPasaporte();
        pass.setFoto("segunda_foto", ".Tiff");
        pass.mostrarPasaporte();
        
    }
}
