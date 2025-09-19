/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5;

/**
 *
 * @author Win
 */
public class Paciente {
    private String nombre;
    private String obraSocial;

    public Paciente(String nombre, String ObraSocial) {
        this.nombre = nombre;
        this.obraSocial = ObraSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String ObraSocial) {
        this.obraSocial = ObraSocial;
    }
    
     public String mostrarPaciente(){
        return "El nombre del paciente es "+nombre+"  y su Obra Social es "+obraSocial;}
      
    
}
