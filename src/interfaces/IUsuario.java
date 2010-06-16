/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import dataTypes.DTTicket;
import dataTypes.DTUsuario;
import java.util.ArrayList;

/**
 *
 * @author gaston
 */
public interface IUsuario {
    public void agregar(DTUsuario usuario);
    public boolean login(int cedula, String password);
    public boolean loginAdmin(String password);
    public void logOut();
    public boolean cambiarPassword(String passwordActual, String passwordNuevo) throws Exception;
    public ArrayList<DTUsuario> listarSubordinados();
    public ArrayList<DTTicket> listarTicketsPendientes();
}
