/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP3;

/**
 2.	Registro de Mascotas
a.	Crear una clase Mascota con los atributos: nombre, especie, edad.

Métodos requeridos: mostrarInfo(), cumplirAnios().

Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y verificar los cambios.

 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private int calificacion;
            
    public void MostrarInfo(){
        System.out.println(this.nombre+" "+apellido+" "+curso+" "+calificacion);
    }
    
    public void SubirCalificacion(int puntos){
        if (puntos>=0){
            this.calificacion += puntos;}
    }
        
    public void BajarCalificacion(int puntos){
         if (puntos>=0){
            this.calificacion -= puntos;}
    }
    public void agregarNombre(String nombre){
         this.nombre = nombre;
    
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
