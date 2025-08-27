/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP3;

/**
 *2.	Registro de Mascotas
a.	Crear una clase Mascota con los atributos: nombre, especie, edad.

Métodos requeridos: mostrarInfo(), cumplirAnios().

Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y verificar los cambios.

 */
public class Ejercicio_02 {
    public static void main(String[] args) {
        
        Mascota mascota1 = new Mascota();
        mascota1.setPonerNombre("Winona");
        mascota1.setAgregarEspecie("Mamífero");
        mascota1.setEdadMascota(7);
        
        mascota1.mostrarInfo();
        mascota1.cumplirAnios();
        mascota1.mostrarInfo();
    }
    }

