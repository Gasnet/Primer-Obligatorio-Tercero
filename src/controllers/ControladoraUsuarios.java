/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import dataTypes.DTTicket;
import dataTypes.DTUsuario;
import interfaces.IUsuario;
import java.util.ArrayList;
import models.UComercial;
import models.UEncargado;
import models.UMarketing;
import models.UTecnico;
import models.Usuario;

/**
 *
 * @author gaston
 */
public class ControladoraUsuarios implements IUsuario{

    private static ControladoraUsuarios instancia = null;

    public static ControladoraUsuarios getInstancia(){
        if(instancia == null){
            instancia = new ControladoraUsuarios();
        }

        return instancia;
    }

    private String passwordAdmin;
    private Usuario usuarioActual;
    private ArrayList<Usuario> usuarios;
    private ArrayList<UMarketing> usuariosMarketing;
    private ArrayList<UComercial> usuariosComercial;
    private ArrayList<UTecnico> usuariosTecnico;
    private UEncargado encargadoMarketing;
    private UEncargado encargadoComercial;
    private UEncargado encargadoTecnico;

    private ControladoraUsuarios() {
        passwordAdmin = "";
        usuarioActual = null;
        usuarios = new ArrayList<Usuario>();
        usuariosMarketing = new ArrayList<UMarketing>();
        usuariosComercial = new ArrayList<UComercial>();
        usuariosTecnico = new ArrayList<UTecnico>();
        encargadoMarketing = null;
        encargadoComercial = null;
        encargadoTecnico = null;
    }


    public UEncargado getEncargadoComercial() {
        return encargadoComercial;
    }

    public UEncargado getEncargadoMarketing() {
        return encargadoMarketing;
    }

    public UEncargado getEncargadoTecnico() {
        return encargadoTecnico;
    }

    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public void agregar(DTUsuario usuario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean cambiarPassword(String passwordActual, String passwordNuevo) throws Exception{
        boolean modificado=false;

        if(usuarioActual == null){
            throw new Exception("Error: No se ha iniciado una sesión");
        }
        
        if(usuarioActual.getPassword().equals(passwordActual)){
            usuarioActual.setPassword(passwordNuevo);            
            modificado=true;
        }       
        
        return modificado;


    }

    public ArrayList<DTUsuario> listarSubordinados() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList<DTTicket> listarTicketsPendientes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void logOut() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean login(int cedula, String password) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean loginAdmin(String password) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
