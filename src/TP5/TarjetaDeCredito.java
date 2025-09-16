/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5;

/**
 *
 * @author Win
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaDeVencimiento;
    private Cliente cliente; //asociacion bidireccional
    private Banco banco; //agregacion

    public TarjetaDeCredito(String numero, String fechaDeVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.banco = banco;
        
    
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(String fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }    

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if(cliente!=null && cliente.getTarjetaDeCredito()!=this){
            cliente.setTarjetaDeCredito(this);
        }
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero = " + numero + "\nfechaDeVencimiento = " + fechaDeVencimiento +"\ncliente = " + (cliente != null ? cliente.getNombre() : "Sin cliente asignado ")+"\n" + banco.getNombre() + "\nCUIT: "+banco.getCuit();
    }
    
    
    
}
