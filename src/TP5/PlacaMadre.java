/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5;

/**
 *
 * @author Win
 */
public class PlacaMadre {
    private String modelo;
    private String chipset;
    

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }        
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    @Override
    public String toString() {
        return "PlacaMadre:" + "\nmodelo = " + modelo + "\nchipset = " + chipset + '}';
    }
    
    
       }

  