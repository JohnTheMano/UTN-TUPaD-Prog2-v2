/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5;

/**
 *
 * @author Win
 */
public class Ejercicio_9 {
    public static void main(String[] args) {
        
         // Instanciamos una cita médica
        CitaMedica citaMedica_1 = new CitaMedica("23/012/2025","16:00");
        
        // Instanciamos un paciente
        Paciente paciente_1 = new Paciente("David Robinson", "Navy");
        
        // Instanciamos un profesional de la salud
        Profesional profesional_1 = new Profesional("Dr. Pánico","Psiquiatra");
        
        // Asociamos un paciente a la cita médica
        citaMedica_1.setPaciente(paciente_1);
        
         // Asociamos un profesional a la cita médica
        citaMedica_1.setProfesional(profesional_1);
        
        // Mostramos resultados por consola
        System.out.println("La cita médica de la fecha "+citaMedica_1.getFecha()+ " en el horario "+ citaMedica_1.getHora()
        + "fue confirmada por el paciente "+paciente_1.getNombre()+" para consulta médica con el "+ profesional_1.getEspecialidad()+" "+profesional_1.getNombre());
        
        
    }
}
