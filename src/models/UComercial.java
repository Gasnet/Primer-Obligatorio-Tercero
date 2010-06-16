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
public class UComercial extends Usuario{

    private ArrayList<Ticket> tickets;

    public UComercial(String nombre, String password, int cedula) {
        super(nombre, password, cedula);
    }

    public void recibirTicket(Ticket t){
        tickets.add(t);
    }

    public ArrayList<Ticket> getTickets(){
        return this.tickets;
    }



}
