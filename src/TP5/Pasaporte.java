/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5;

/**
 *
 * @author Win
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;
    

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen,formato);
    }
    
    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    /*
        Este metodo rompe la composición, 
    public Foto getFoto() {
        return foto;
    }*/  

    public void setFoto(String imagen,String formato) {
        this.foto = new Foto(imagen,formato);
    }
    
    public void mostrarPasaporte(){
        System.out.println("El pasaporte número " + this.numero + " se emitió el " + this.fechaEmision + " y su foto es "+foto.getImagen()+ " con formato "+foto.getFormato());
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + ", foto=" + foto.getImagen() + ", titular=" + titular.getNombre() + '}';
    }

   

    
    
    
   
}
