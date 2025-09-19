/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5;

/**
 *
 * @author Win
 */
public class CitaMedica {
    private String fecha;
    private String hora;
    private String Paciente;
    private String Profesional;

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
        this.Paciente = Paciente;
        this.Profesional = Profesional;
    }
    

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPaciente() {
        return Paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.Paciente = Paciente;
    }

    public String getProfesional() {
        return Profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.Profesional = Profesional;
    }
    
    
    
}
