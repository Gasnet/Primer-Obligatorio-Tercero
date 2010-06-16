/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import dataTypes.DTUsuario;
import dataTypes.TipoUsuario;

/**
 *
 * @author gaston
 */
public class UOperador extends Usuario{

    public UOperador(String nombre, String password, int cedula) {
        super(nombre, password, cedula);
    }

    public DTUsuario toDTUsuario(){
        return new DTUsuario(getNombre(), getPassword(), getCedula(), TipoUsuario.UOperador);
    }

}
