/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dataTypes;

/**
 *
 * @author gaston
 */
public class DTUsuario {
    private String nombre;
    private String password;
    private int cedula;
    private TipoUsuario tipo;

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public DTUsuario(String nombre, String password, int cedula, TipoUsuario tipo) {
        this.nombre = nombre;
        this.password = password;
        this.cedula = cedula;
        this.tipo = tipo;
    }

    


}
