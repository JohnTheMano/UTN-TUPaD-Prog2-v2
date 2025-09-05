/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP4;

public class Prueba {
    public static void main(String[] args) {
        // Crear empleados usando constructores sobrecargados
        Empleado empleado_1 = new Empleado("Dennis","Director",15000000);
        Empleado empleado_2 = new Empleado("Scottie","Manager");
        Empleado empleado_3 = new Empleado("Michael","Administrador");
        Empleado empleado_4 = new Empleado("Luc","Operario",50000);
        
        // Mostrar datos iniciales de cada empleado
        System.out.println(empleado_1);
        System.out.println(empleado_2);
        System.out.println(empleado_3);
        System.out.println(empleado_4);
        
        // Actualizar salarios con distintos métodos (porcentaje o cantidad fija)
        empleado_1.actualizarSalario(25);    // aumento fijo
        empleado_2.actualizarSalario(300);   // aumento fijo
        empleado_3.actualizarSalario(0.20);  // aumento 20%
        empleado_4.actualizarSalario(0.15);  // aumento 15%
        
        // Mostrar datos actualizados de cada empleado
        System.out.println(empleado_1);
        System.out.println(empleado_2);
        System.out.println(empleado_3);
        System.out.println(empleado_4);
        
        // Mostrar total de empleados creados (atributo estático)
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
