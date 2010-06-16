/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dataTypes;

/**
 *
 * @author gaston
 */
public enum NombreEstado {
    //Estado Comunes a todos los tipos de Tickets
    Notificado,Asignado,
    //Sugerencia
    Aceptado,Rechazado,
    //Comentario
    Visto,Desestimado,
    //Queja
    Atendida,Descartada,
    //Sol.Tecnica
    Solucionado_por_Telefono,Solucionado_en_el_Lugar;
}
