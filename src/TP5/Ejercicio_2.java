/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5;

/**
 *
 * @author Win
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        
        //a.	Agregación: Celular → Batería
        //Instanciamos una bateria nueva
        Bateria bateria1 = new Bateria("CX345FV","5000");
        System.out.println("La bateria "+bateria1.getModelo()+" Tiene una capacidad de: "+bateria1.getCapacidad()+" mAh");    
        
        //instanciamos un celular nuevo y pasamos la bateria como parametro
        Celular celular1 = new Celular("17744763","Xiaomi","Redmi note 14",bateria1);
        //Visualizamos resultados
        System.out.println("El celular cuyo imei es " + celular1.getImei() + " es de marca " + celular1.getMarca()+" y el modelo es "
                + celular1.getModelo() + ". Tiene instlada la bateria " + celular1.getBateria().getModelo() + ", cuya capacidad es de " 
                + celular1.getBateria().getCapacidad()+" mAh.");
        
        
        //b.	Asociación bidireccional: Celular ↔ Usuario
        //creamos nuevo usuario
        Usuario usuario1 = new Usuario("Gregorio","26736543");
        //Asociamos
        celular1.setUsuario(usuario1);
        usuario1.setCelular(celular1);
        //Visualizamos pruebas
        System.out.println("Este celular es de: " +celular1.getUsuario().getNombre());
        System.out.println(usuario1.getNombre()+ " tiene un celular "+usuario1.getCelular().getModelo());
        
    }
    
}
