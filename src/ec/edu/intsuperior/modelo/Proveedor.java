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
public class Proveedor {
    private String idProveedor;
    private TipoProveedor tProveedor;

    public Proveedor() {
    }

    public Proveedor(String idProveedor, TipoProveedor tProveedor) {
        this.idProveedor = idProveedor;
        this.tProveedor = tProveedor;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public TipoProveedor gettProveedor() {
        return tProveedor;
    }

    public void settProveedor(TipoProveedor tProveedor) {
        this.tProveedor = tProveedor;
    }
    
    
    
    
    
}
