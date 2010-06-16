/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import java.util.ArrayList;

/**
 *
 * @author gaston
 */
public class UMarketing extends Usuario{

    private ArrayList<Ticket> tickets;
    private ArrayList<Sugerencia> sugerencias;
    private ArrayList<Comentario> comentarios;

    public UMarketing(String nombre, String password, int cedula) {
        super(nombre, password, cedula);
    }

    public void recibirTicket(Ticket t){
        if(t instanceof Comentario){
            comentarios.add(((Comentario)t));
        }
        else if(t instanceof Sugerencia){
            sugerencias.add(((Sugerencia)t));
        }
        tickets.add(t);
    }

    public ArrayList<Ticket> getTickets(){
        return this.tickets;
    }




}
