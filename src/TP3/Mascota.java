/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP3;

/**
 *
 * @author Win
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    
       
    public void mostrarInfo(){
        System.out.println(nombre +" "+especie+""+edad);
    };
    public void cumplirAnios(){
        this.edad +=1;
    };
    
    public void setPonerNombre(String nombre){
        this.nombre = nombre;
    }
    public void setAgregarEspecie(String especie){
        this.especie=especie;
    }
    public void setEdadMascota(int num){
        this.edad = num;
    }
}

