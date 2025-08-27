/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP3;

/**
 *
 * @author Win
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public void ponerHuevo(){
        this.huevosPuestos+=1;            
    }  
    public void envejecer(){
        this.edad += 1;
    }
    public void mostrarEstado(){
        System.out.println("ID: "+idGallina +" \nEdad: "+ edad + "\nCantidad de Huevos: " + huevosPuestos+"\n");
    }
    
    public void setId(int id){
        this.idGallina = id;
    }
}
