/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Santiago
 */
public class Cliente extends Persona{
    private String idCliente;

    public Cliente() {
    }

    public Cliente(String idCliente, String cedula, String nombre1, String nombre2, String apellido1, String apellido2, String direccion, String telefono, String email) {
        super(cedula, nombre1, nombre2, apellido1, apellido2, direccion, telefono, email);
        this.idCliente = idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }
     
    
    
    
    
}
