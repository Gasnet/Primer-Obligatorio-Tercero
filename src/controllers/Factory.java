/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import interfaces.ITicket;
import interfaces.IUsuario;

/**
 *
 * @author gaston
 */
public class Factory {

    public static IUsuario getControladoraUsuario(){
        return ControladoraUsuarios.getInstancia();
    }

    public static ITicket getControladoraTicket(){
        return ControladoraTickets.getInstancia();
    }
}
