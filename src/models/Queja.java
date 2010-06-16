/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import dataTypes.NombreEstado;

/**
 *
 * @author gaston
 */
public class Queja extends Ticket{

    public Queja(Titulo titulo, String nombreCliente, String telefono, String detalle, String direccion, Estado estadoInicial) {
        super(titulo, nombreCliente, telefono, detalle, direccion, estadoInicial);
         //asignamos nombres de estados finales permitidos
        estadosFinales.add(NombreEstado.Atendida);
        estadosFinales.add(NombreEstado.Descartada);
    }


}
