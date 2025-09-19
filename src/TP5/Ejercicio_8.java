/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5;

/**
 *
 * @author Win
 */
public class Ejercicio_8 {
    public static void main(String[] args) {
        
        // Instanciamos un usuario 
        Usuario usuario_3 = new Usuario("Leonardo Madelón","leonardoCarol_89@gmail.com");
        
        // Instanciamos un documento
        Documento documento_3 = new Documento("Motivacion en el deporte","Es logico pensar que...");
        
        // Asociamos una firma digital al documento - composición (la firma digital forma parte del documento)
        // También se usa el objeto Usuario dentro de la firma digital - agregación
        documento_3.setFirmaDigital("be0c7c34f6d804019e1190", "28/02/2030", usuario_3);
        
        // Mostramos los datos de la firma digital
        documento_3.mostrarFirmaDigital();
        
        // Mostramos los datos del usuario
        System.out.println("El usuario "+usuario_3.getNombre()+" tiene el siguiente e-mail: "+usuario_3.getEmail());
        
    }
}
