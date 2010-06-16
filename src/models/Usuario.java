/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

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



}
