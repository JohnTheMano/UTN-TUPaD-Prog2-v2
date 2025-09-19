/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5;

/**
 *
 * @author Win
 */
public class Usuario {
    private String nombre;
    private int dni;
    private Celular celular;
    private String email;

    public Usuario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni; 
    }

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
            
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String mostrarMailYUsuario(){
        return "El Usuario " + nombre + " tiene el siguiente E-mail: " + email;
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + ", celular=" + celular.getModelo() + '}';
    }
    
    
}
