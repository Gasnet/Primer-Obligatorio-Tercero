/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import dataTypes.DTTicket;
import dataTypes.DTTitulo;
import dataTypes.DTUsuario;
import dataTypes.TipoTicket;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gaston
 */
public interface ITicket {
    public void agregar(DTTicket ticket);
    public void asignarTicket(DTTicket ticket, DTUsuario usuario);
    public void finalizar(DTTicket ticket);
    public ArrayList<DTTicket> listarTicketsGerente(TipoTicket tipo, Date fechaInicial, Date fechaFinal, boolean activos, boolean finalizados);
    public ArrayList<DTTicket> listarTicketsEncargado(Date fechaInicial, Date fechaFinal, boolean activos, boolean finalizados);
    public ArrayList<DTTitulo> listarTitulos(TipoTicket tipo);
}
