/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5;

/**
 *
 * @author Win
 */
public class Ejercicio_14 {
    public static void main(String[] args) {
        // Instanciamos un proyecto con nombre y duración
        Proyecto proyecto_1 = new Proyecto("Documental sobre el Trabajo Práctico 5: Relaciones UML 1 a 1", 56000);
        
        // Instanciamos el editor de video
        EditorVideo editor = new EditorVideo();
        
        // Exportamos el proyecto en un formato determinado (dependencia de creación)
        editor.exportar("avi", proyecto_1);
    }
}
