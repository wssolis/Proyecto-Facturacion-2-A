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
public class TipoProducto {
    private String idTipoProducto;
    private String detalleTipo;
    private String estadoProducto;

    public TipoProducto() {
    }

    public TipoProducto(String idTipoProducto, String detalleTipo, String estadoProducto) {
        this.idTipoProducto = idTipoProducto;
        this.detalleTipo = detalleTipo;
        this.estadoProducto = estadoProducto;
    }

    public String getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(String estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public String getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(String idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public String getDetalleTipo() {
        return detalleTipo;
    }

    public void setDetalleTipo(String detalleTipo) {
        this.detalleTipo = detalleTipo;
    }
    
    
}
