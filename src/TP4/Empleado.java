package TP4;

public class Empleado {
    /*Encapsulamiento en los atributos:*/
    private int id;                 // Identificador único del empleado
    private String nombre;          // Nombre del empleado
    private String puesto;          // Cargo del empleado
    private double salario;         // Salario actual
    private static int totalEmpleados;  // Contador estático de empleados creados
    
    // Método estático para obtener el total de empleados creados
    public static int mostrarTotalEmpleados(){
       return totalEmpleados;
    }
    
    /*Constructores: Uso de this en los constructores para distinguir parámetros de atributos.*/
    // Constructor con todos los atributos
    public Empleado(String nombre, String puesto, double salario){
        this.id = totalEmpleados+1;  // Asigna un id automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados ++;           // Incrementa contador total de empleados
    }
    
    // Constructor con solo nombre y puesto, salario por defecto 0
    public Empleado(String nombre, String puesto) {
        this.id = totalEmpleados+1;  // Asigna un id automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 0;            // Salario inicial 0
        totalEmpleados ++;           // Incrementa contador total de empleados
    }
    
    /*Metodos Sobrecargados - actualizarSalario:*/
    // Actualiza salario por porcentaje (ejemplo 0.20 para 20%)
    public void actualizarSalario(double porcentaje){
        if (porcentaje>0){
            this.salario += this.salario*porcentaje;
        }
    }
    
    // Actualiza salario por cantidad fija
    public void actualizarSalario(int cantidadFija){
        if (cantidadFija>0){
            this.salario += cantidadFija;
        }
    }

    @Override
    // Representación legible del empleado, salario con 2 decimales
    public String toString() {
        return "id: " + id + "\n nombre: " + nombre + "\n puesto: " + puesto + "\n salario: " +  String.format("%.2f", salario) +"\n================";
    }
    
    /*Metodos getters*/
    public String getNombre() {
        return nombre;              // Retorna el nombre
    }
    public String getPuesto(){
        return puesto;              // Retorna el puesto
    }
    public double getSalario(){
        return salario;             // Retorna el salario
    }
     
    /*Metodos setters*/
    public void setNombre(String nombre){
        this.nombre = nombre;       // Cambia el nombre
    }
    public void setPuesto(String puesto){
        this.puesto = puesto;       // Cambia el puesto
    }
    public void setSalario(double salario){
        this.salario = salario;     // Cambia el salario
    }    
}
