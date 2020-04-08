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
public class Amigo implements Serializable{
    private String nombre;
    private String correo;

    public Amigo(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public Amigo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
