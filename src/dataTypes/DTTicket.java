/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dataTypes;

import java.util.ArrayList;

/**
 *
 * @author gaston
 */
public class DTTicket {
    private int id;
    private String nombreCliente;
    private String direccion;
    private String telefono;
    private String detalle;
    private TipoTicket tipo;
    private ArrayList<DTEstado> estados;

    public String getDetalle() {
        return detalle;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<DTEstado> getEstados() {
        return estados;
    }

    public int getId() {
        return id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public TipoTicket getTipo() {
        return tipo;
    }

    public DTTicket(int id, String nombreCliente, String direccion, String telefono, String detalle, TipoTicket tipo, ArrayList<DTEstado> estados) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.direccion = direccion;
        this.telefono = telefono;
        this.detalle = detalle;
        this.tipo = tipo;
        this.estados = estados;
    }

    

}
