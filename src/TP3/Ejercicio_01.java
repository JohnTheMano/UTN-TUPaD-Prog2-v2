/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP3;

import java.util.Scanner;

/**
 1.	Registro de Estudiantes
a.	Crear una clase Estudiante con los atributos: nombre, apellido, curso, calificación.
Métodos requeridos: mostrarInfo(), subirCalificacion(puntos), bajarCalificacion(puntos).
Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir calificaciones.

 */
public class Ejercicio_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Michael");
        estudiante1.setApellido("Scott");
        estudiante1.setCurso("Organización Empresarial");
        estudiante1.setCalificacion(9);
        estudiante1.MostrarInfo();
        estudiante1.BajarCalificacion(4);
        estudiante1.MostrarInfo();
        estudiante1.SubirCalificacion(5);
        estudiante1.MostrarInfo();
                        
    }
}
