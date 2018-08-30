/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufpr.tads.web2.classes;

import java.io.Serializable;

/**
 *
 * @author gabri
 */
public class Usuario implements Serializable{
    private int idusuario;
    private String loginusuario;
    private String senhausuario;
    private String nomeusuario;

    public Usuario(){
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getLoginusuario() {
        return loginusuario;
    }

    public void setLoginusuario(String loginusuario) {
        this.loginusuario = loginusuario;
    }

    public String getSenhausuario() {
        return senhausuario;
    }

    public void setSenhausuario(String senhausuario) {
        this.senhausuario = senhausuario;
    }

    public String getNomeusuario() {
        return nomeusuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }
      
    
}
