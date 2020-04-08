/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Pablo Caiza
 */
public class Grupo implements Serializable{
    //atibutos
    private String nombre;
    private String descripcion;
    private ArrayList<Usuario>listaGrupo=new ArrayList<>();
    //constructores

    public Grupo() {
    }

    public Grupo(String nombre, String descripcion,ArrayList<Usuario>grupos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.listaGrupo=grupos;
    }
    //metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Usuario> getListaGrupo() {
        return listaGrupo;
    }

    public void setListaGrupo(ArrayList<Usuario> listaGrupo) {
        this.listaGrupo = listaGrupo;
    }
    
    
    
}
