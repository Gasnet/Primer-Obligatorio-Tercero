/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import dataTypes.DTEstado;
import dataTypes.DTTicket;
import dataTypes.NombreEstado;
import dataTypes.TipoTicket;
import java.util.ArrayList;

/**
 *
 * @author gaston
 */
public class Comentario extends Ticket{

    public Comentario(Titulo titulo, String nombreCliente, String telefono, String detalle, String direccion, Estado estadoInicial) {
        super(titulo, nombreCliente, telefono, detalle, direccion, estadoInicial);
         //asignamos nombres de estados finales permitidos
        estadosFinales.add(NombreEstado.Visto);
        estadosFinales.add(NombreEstado.Desestimado);
    }

    public DTTicket toDTTicket(){
        ArrayList<DTEstado> estados = new ArrayList<DTEstado>();
        estados.add
        return new DTTicket(getId(), getNombreCliente(), getDireccion(),
                            getTelefono(), getDetalle(), TipoTicket.Comentario, null)
    }


}
