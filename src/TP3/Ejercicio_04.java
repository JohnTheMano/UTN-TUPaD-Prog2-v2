/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP3;

/**
 4.	Gestión de Gallinas en Granja Digital
a.	Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos.
Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().

Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y mostrar su estado.

 */
public class Ejercicio_04 {
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina();
        gallina1.setId(1);
        
        Gallina gallina2 = new Gallina();
        gallina2.setId(2);
    
        
        gallina1.envejecer();
        gallina1.envejecer();
        gallina1.envejecer();
        gallina1.envejecer();
        gallina1.ponerHuevo();
        gallina1.mostrarEstado();
        
        
        gallina2.envejecer();
        gallina2.envejecer();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.mostrarEstado();
        
        
    
    }
    
}
