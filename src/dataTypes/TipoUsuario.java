/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dataTypes;

/**
 *
 * @author gaston
 */
public enum TipoUsuario {
    UOperador,
    UGerente,
    //Encargado genérico. Se retorna en la operacion toDTUsuario
    UEncargado,
    UEncargadoMarketing,
    UEncargadoComercial,
    UEncargadoTecnico,
    UMarketing,
    UComercial,
    UTecnico;
}
