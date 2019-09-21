/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import com.mycompany.entity.Usuario;
import ejb.UsuarioFacadeLocal;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Hernan
 */
@ManagedBean
@RequestScoped
public class Index implements Serializable {
    
    private String nombre;
    private String apellido;
    private String usuario;
    private String clave;
    private int cedula;
    private int cuenta;
   
    @EJB
    UsuarioFacadeLocal usuarioCon;
    
    public void crearUsuario(){
        
    Usuario user =new Usuario();
    /*

    user.setNombre(nombre);
    user.setApellido(apellido);
    user.setUsuario(usuario);
    user.setClave(clave);
    user.setId(cedula);
    user.setFk_cuenta(cuenta);
    */
    
    user.setNombre("Hernan");
    user.setUsuario("Her");
    user.setClave("esta");
    user.setId(107);
     
    usuarioCon.create(user);
    
        FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage( null,new FacesMessage(FacesMessage.SEVERITY_INFO, "success"," Usuario Creado"));
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public UsuarioFacadeLocal getUsuarioCon() {
        return usuarioCon;
    }

    public void setUsuarioCon(UsuarioFacadeLocal usuarioCon) {
        this.usuarioCon = usuarioCon;
    }
    
  
}



