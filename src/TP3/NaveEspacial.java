/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP3;

/**
5.	Simulación de Nave Espacial

Crear una clase NaveEspacial con los atributos: nombre, combustible.

Métodos requeridos: despegar(), avanzar(distancia), recargarCombustible(cantidad), mostrarEstado().
Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que se supere el límite al recargar.
Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin recargar, luego recargar y avanzar correctamente. Mostrar el estado al final.

 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private boolean despegue;
    
    public void despegar(){
        despegue = true;
        System.out.println(nombre + " ha despegado!!!");
    }
    
    public void avanzar(int distancia){
        if (despegue){
            if(combustible>=distancia){
                System.out.println(nombre +" avanza "+distancia+"Km");
                combustible-=distancia;
            } else {System.out.println("No hay suficiente combustible");
              }
         } else{System.out.println("La nave"+nombre+" aún no ha despegado");
            }
    }
    public void recargarCombustible(int cantidad){
        if(cantidad + combustible <= 100){
            combustible += cantidad;
            System.out.println("Recarga de "+cantidad+" litros de combustible completa");
        }
        else{System.out.println("La cantidad de combustible que desea recargar excede los limites del tanque");
        }
    }
    public void mostrarEstado(){
        System.out.println("Nombre: "+nombre+"\nCombustible: "+combustible);
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCombustible(int cantidad){
        this.combustible = cantidad;
    }
    
    public void getNombre(){
        System.out.println("Nombre: "+nombre);
    }
    
    public void getCombustible(){
        System.out.println("Combustible restante: "+combustible);
    }
}
