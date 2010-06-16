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
public class Usuario {

    private String nombre;
    private String password;
    private int cedula;

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuario(String nombre, String password, int cedula) {
        this.nombre = nombre;
        this.password = password;
        this.cedula = cedula;
    }

    public Usuario() {
        this.nombre = "";
        this.password = "";
        this.cedula = 0;
    }



    public DTUsuario toDTUsuario(){
        TipoUsuario tipo = null;

        if(this instanceof UComercial){
            tipo = TipoUsuario.UComercial;
        }else if(this instanceof UEncargado){
            tipo = TipoUsuario.UEncargado;
        }else if(this instanceof UGerente){
            tipo = TipoUsuario.UGerente;
        }else if(this instanceof UMarketing){
            tipo = TipoUsuario.UMarketing;
        }else if(this instanceof UOperador){
            tipo = TipoUsuario.UOperador;
        }else if(this instanceof UTecnico){
            tipo = TipoUsuario.UTecnico;
        }

        return new DTUsuario(this.nombre, this.password, this.cedula, tipo);
    }
}
