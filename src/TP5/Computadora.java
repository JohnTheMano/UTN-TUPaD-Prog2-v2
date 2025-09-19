/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5;

/**
 *
 * @author Win
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private Propietario propietario;
    private PlacaMadre placaMadre;

    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modelo,chipset);
    }      
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getNumeroSerie() {
        return numeroSerie;
    }
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    

    public void setPlacaMadre(String modelo, String chipset) {
        this.placaMadre = new PlacaMadre(modelo,chipset);
    }
    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if(propietario != null && propietario.getComputadora()!=this){
            propietario.setComputadora(this);
        }
    }

    @Override
    public String toString() {
        return "Computadora:" + "\nmarca = " + marca + "\n numeroSerie=" + numeroSerie + "\n propietario=" + (propietario != null ? propietario.getNombre() : "sin propietario") + "\n placaMadre=" + placaMadre;
    }
    
    
}
