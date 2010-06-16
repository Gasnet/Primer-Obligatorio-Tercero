/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dataTypes;

/**
 *
 * @author gaston
 */
public class DTTitulo {
    private int id;
    private String titulo;
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public DTTitulo(int id, String titulo, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    

}
