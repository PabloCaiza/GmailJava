/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author Pablo Caiza
 */
public class Mensaje implements Serializable{
    //los atributos de la vlase
    private String emisor;
    private String destinatario;
    private String asunto;
    private String contenido;
    private boolean estado;
    //Constructores

    public Mensaje() {
    }
    
    public Mensaje(String emisor, String destinatario, String asunto, String contenido, boolean estado) {
        this.emisor = emisor;
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.contenido = contenido;
        this.estado = estado;
    }

    public Mensaje(String emisor, String destinatario, String asunto, String contenido) {
        this.emisor = emisor;
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.contenido = contenido;
    }
    

    

    
    //metodos 

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
        public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    
    
    //creamos  un string que nos va dar formato al objeto

    @Override
    public String toString() {
        return "Mensaje{" + "emisor=" + emisor + ", destinatario=" + destinatario + ", asunto=" + asunto + ", contenido=" + contenido + '}';
    }

    
    
    


    
    
}
