/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dataTypes;

import java.util.Date;

/**
 *
 * @author gaston
 */
public class DTEstado {
    private NombreEstado estado;
    private String observacion;
    private Date fecha;
    private DTUsuario usuario;

    public NombreEstado getEstado() {
        return estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public DTUsuario getUsuario() {
        return usuario;
    }

    public DTEstado(NombreEstado estado, String observacion, Date fecha, DTUsuario usuario) {
        this.estado = estado;
        this.observacion = observacion;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    
}
