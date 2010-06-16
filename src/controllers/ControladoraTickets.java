/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import dataTypes.DTTicket;
import dataTypes.DTTitulo;
import dataTypes.DTUsuario;
import dataTypes.TipoTicket;
import interfaces.ITicket;
import java.util.ArrayList;
import java.util.Date;
import models.Queja;
import models.SolTecnicas;
import models.Ticket;
import models.Titulo;

/**
 *
 * @author gaston
 */
public class ControladoraTickets implements ITicket{

    private static ControladoraTickets instancia = null;

    public static ControladoraTickets getInstancia(){
        if(instancia==null){
            instancia = new ControladoraTickets();
        }

        return instancia;
    }

    private ArrayList<Titulo> titulosTecnicos;
    private ArrayList<Titulo> titulosSugerenciasYComentarios;
    private ArrayList<Titulo> titulosQuejas;
    private ArrayList<Ticket> tickets;
    private ArrayList<Ticket> ticketsSugerenciasYComentarios;
    private ArrayList<Queja> ticketsQuejas;
    private ArrayList<SolTecnicas> ticketsSolTecnicas;

    private ControladoraTickets() {
        titulosTecnicos = new ArrayList<Titulo>();
        titulosSugerenciasYComentarios = new ArrayList<Titulo>();
        titulosQuejas = new ArrayList<Titulo>();
        tickets = new ArrayList<Ticket>();
        ticketsSugerenciasYComentarios = new ArrayList<Ticket>();
        ticketsQuejas = new ArrayList<Queja>();
        ticketsSolTecnicas = new ArrayList<SolTecnicas>();
        cargarTitulos();
    }




    public void agregar(DTTicket ticket) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void asignarTicket(DTTicket ticket, DTUsuario usuario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void finalizar(DTTicket ticket) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList<DTTicket> listarTicketsEncargado(Date fechaInicial, Date fechaFinal, boolean activos, boolean finalizados) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList<DTTicket> listarTicketsGerente(TipoTicket tipo, Date fechaInicial, Date fechaFinal, boolean activos, boolean finalizados) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList<DTTitulo> listarTitulos(TipoTicket tipo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void cargarTitulos(){
        //Agregar titulos para solicitudes tecnicas
        titulosTecnicos.add(new Titulo("Equipo no enfría", "El cliente especifica que el equipo esta en modo could y no tira aire frio"));
        titulosTecnicos.add(new Titulo("Equipo no calienta", "El cliente especifica que el equipo esta en modo heat y no tira aire caliente"));
        titulosTecnicos.add(new Titulo("Equipo no enciende", "El cliente especifica que el equipo esta conectado a la red electrica y no enciende"));
        titulosTecnicos.add(new Titulo("Otros", "Sin especificar"));

        //Agregar titulos para sugerencias y comentarios
        titulosSugerenciasYComentarios.add(new Titulo("Muy bueno el embalaje", "El cliente destaca la calidad o condiciones en que fue entregado el equipo"));
        titulosSugerenciasYComentarios.add(new Titulo("Rápida entrega", "El cliente manifiesta su conformidad con la rapidez de entrega y colocaccion del equipo"));
        titulosSugerenciasYComentarios.add(new Titulo("Variedad de Colores", "El cliente sugiere importar equipos con colores no tradicionales"));
        titulosSugerenciasYComentarios.add(new Titulo("Variedad de tamaños", "El cliente sugiere importar equipos de diferentes tamaños"));
        titulosSugerenciasYComentarios.add(new Titulo("Otros", "Sin especificar"));

        //Agregar titulos para quejas
        titulosQuejas.add(new Titulo("Atencion al publico", "El cliente está desconforme con la atencion brindada por la empresa"));
        titulosQuejas.add(new Titulo("Equipo mal reparado", "El cliente está desconforme el service realizado en su equipo"));
        titulosQuejas.add(new Titulo("Instalacion", "El cliente manifiesta su desconformidad en la instalacion del equipo"));
        titulosQuejas.add(new Titulo("Otros", "Sin especificar"));
    }

}
