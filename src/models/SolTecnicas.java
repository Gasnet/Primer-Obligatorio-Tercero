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
public class SolTecnicas extends Ticket{

    public SolTecnicas(Titulo titulo, String nombreCliente, String telefono, String detalle, String direccion, Estado estadoInicial) {
        super(titulo, nombreCliente, telefono, detalle, direccion, estadoInicial);
        //asignamos nombres de estados finales permitidos
        estadosFinales.add(NombreEstado.Solucionado_en_el_Lugar);
        estadosFinales.add(NombreEstado.Solucionado_por_Telefono);
    }



}
