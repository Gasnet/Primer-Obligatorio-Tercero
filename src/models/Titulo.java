/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import dataTypes.DTTitulo;

/**
 *
 * @author gaston
 */
public class Titulo {

    private static int contador=0;
    private int id;
    private String titulo;
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getId() {
        return id;
    }


    public Titulo(String titulo, String descripcion) {
        this.id = ++contador;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public DTTitulo toDTTitulo(){
        return new DTTitulo(this.id, this.titulo, this.descripcion);
    }

    


}
