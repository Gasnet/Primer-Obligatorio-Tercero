/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

/**
 *
 * @author gaston
 */
public class Titulo {

    private String titulo;
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public Titulo(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    


}
