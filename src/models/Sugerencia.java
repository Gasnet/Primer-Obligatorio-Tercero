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
public class Sugerencia extends Ticket{

    public Sugerencia(Titulo titulo, String nombreCliente, String telefono, String detalle, String direccion, Estado estadoInicial) {
        super(titulo, nombreCliente, telefono, detalle, direccion, estadoInicial);
         //asignamos nombres de estados finales permitidos
        estadosFinales.add(NombreEstado.Aceptado);
        estadosFinales.add(NombreEstado.Rechazado);
    }


}
