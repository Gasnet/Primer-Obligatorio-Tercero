/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import dataTypes.DTEstado;
import dataTypes.NombreEstado;
import java.util.Date;

/**
 *
 * @author gaston
 */
public class Estado {

    private NombreEstado nombre;
    private String observacion;
    private Date fecha;
    private Usuario usuario;

    public Date getFecha() {
        return fecha;
    }

    public NombreEstado getNombre() {
        return nombre;
    }

    public String getObservacion() {
        return observacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setNombre(NombreEstado nombre) {
        this.nombre = nombre;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Estado() {
        this.nombre = null;
        this.observacion = "";
        this.fecha = new Date();
        this.usuario = null;
    }

    public Estado(NombreEstado nombre, String observacion, Date fecha, Usuario usuario) {
        this.nombre = nombre;
        this.observacion = observacion;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public DTEstado toDTEstado(){
        return new DTEstado(this.nombre, this.observacion, this.fecha, null)
    }





}
