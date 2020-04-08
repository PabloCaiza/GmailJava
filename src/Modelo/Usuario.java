/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Pablo Caiza
 */
public class Usuario implements Serializable {

    //atributos
    private String nombre;
    private String correo;
    private String clave;
    private ImageIcon imagen;
    private ArrayList<Mensaje> listaEnviados = new ArrayList<>();
    private ArrayList<Mensaje> listaRecibidos = new ArrayList<>();
    private ArrayList<Mensaje> listaBorrador=new ArrayList<>();
    public static ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    private ArrayList<Usuario> listaAmigo = new ArrayList<>();
    private ArrayList<Grupo> listaGrupos = new ArrayList<>();
    

    //contructores
    public Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public Usuario() {

    }

    public Usuario(String nombre, String correo, ImageIcon imagen) {
        this.nombre = nombre;
        this.correo = correo;
        this.imagen = imagen;
    }
    
        public Usuario(String nombre, String correo, String clave, ImageIcon imagen, ArrayList<Usuario> listaAmigos,
            ArrayList<Mensaje> enviados, ArrayList<Mensaje> recibidos, ArrayList<Grupo> grupos,ArrayList<Mensaje>borrador) {
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.imagen = imagen;
        this.listaAmigo = listaAmigos;
        this.listaEnviados = enviados;
        this.listaRecibidos = recibidos;
        this.listaGrupos=grupos;
        this.listaBorrador=borrador;
    }

//    public Usuario(String nombre, String correo, String clave, ImageIcon imagen, ArrayList<Usuario> listaAmigos,
//            ArrayList<Mensaje> enviados, ArrayList<Mensaje> recibidos, ArrayList<Grupo> grupos) {
//        this.nombre = nombre;
//        this.correo = correo;
//        this.clave = clave;
//        this.imagen = imagen;
//        this.listaAmigo = listaAmigos;
//        this.listaEnviados = enviados;
//        this.listaRecibidos = recibidos;
//        this.listaGrupos=grupos;
//    }

    public Usuario(String nombre, String correo, String clave, ImageIcon imagen, ArrayList<Usuario> listaAmigos,
            ArrayList<Mensaje> enviados, ArrayList<Mensaje> recibidos) {
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.imagen = imagen;
        this.listaAmigo = listaAmigos;
        this.listaEnviados = enviados;
        this.listaRecibidos = recibidos;
    }

    public Usuario(String nombre, String correo, String clave, ArrayList<Usuario> listaAmigos, ArrayList<Mensaje> enviados, ArrayList<Mensaje> recibidos) {
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.listaAmigo = listaAmigos;
        this.listaEnviados = enviados;
        this.listaRecibidos = recibidos;
    }

    public Usuario(String nombre, String correo, String clave, ArrayList<Usuario> listaAmigos) {
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.listaAmigo = listaAmigos;
    }

    public Usuario(String nombre, String correo, String clave) {
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
    }
    //metodos

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
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

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public ArrayList<Mensaje> getListaEnviados() {
        return listaEnviados;
    }

    public void setListaEnviados(ArrayList<Mensaje> listaEnviados) {
        this.listaEnviados = listaEnviados;
    }

    public ArrayList<Mensaje> getListaRecibidos() {
        return listaRecibidos;
    }

    public void setListaRecibidos(ArrayList<Mensaje> listaRecibidos) {
        this.listaRecibidos = listaRecibidos;
    }

    public ArrayList<Usuario> getListaAmigo() {
        return listaAmigo;
    }

    public void setListaAmigo(ArrayList<Usuario> listaAmigo) {
        this.listaAmigo = listaAmigo;
    }

    public ArrayList<Grupo> getListaGrupos() {
        return listaGrupos;
    }

    public void setListaGrupos(ArrayList<Grupo> listaGrupos) {
        this.listaGrupos = listaGrupos;
    }

    public ArrayList<Mensaje> getListaBorrador() {
        return listaBorrador;
    }

    public void setListaBorrador(ArrayList<Mensaje> listaBorrador) {
        this.listaBorrador = listaBorrador;
    }
    
    
    

}
