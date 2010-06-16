/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package models;
import dataTypes.DTTicket;
import dataTypes.NombreEstado;
import dataTypes.TipoTicket;
import java.util.ArrayList;

/**
 *
 * @author gaston
 */
public class Ticket {

    private static int contador = 0;
    private int id;
    private Titulo titulo;
    private String nombreCliente;
    private String direccion;
    private String telefono;
    private String detalle;
    protected ArrayList<NombreEstado> estadosFinales;
    private Estado notificado;
    private Estado asignado;
    private Estado finalizado;

    public Estado getAsignado() {
        return asignado;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public String getDetalle() {
        return detalle;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<NombreEstado> getEstadosFinales() {
        return estadosFinales;
    }

    public Estado getFinalizado() {
        return finalizado;
    }

    public int getId() {
        return id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public Estado getNotificado() {
        return notificado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setAsignado(Estado asignado) {
        this.asignado = asignado;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public void setFinalizado(Estado finalizado) {
        this.finalizado = finalizado;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setNotificado(Estado notificado) {
        this.notificado = notificado;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Ticket(Titulo titulo, String nombreCliente, String telefono, String detalle, String direccion, Estado estadoInicial) {
        this.titulo = titulo;
        this.nombreCliente = nombreCliente;
        this.telefono = telefono;
        this.detalle = detalle;
        this.direccion = direccion;
        this.notificado = estadoInicial;
    }

    public Ticket() {
        this.contador++;
        this.id = this.contador;
        this.titulo = null;
        this.nombreCliente = "";
        this.telefono = "";
        this.detalle = "";
        this.direccion = "";
        this.notificado = null;
    }
}
