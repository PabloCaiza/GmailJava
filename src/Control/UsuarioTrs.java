/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Usuario;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pablo Caiza
 */
public class UsuarioTrs {

    public void guardarFichero(String direccion, Object objeto) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(direccion))) {
            //La línea anterior permite cerrar Ficheros automaticamente (posterior a version 7 Java)
            oos.writeObject(objeto); // No se necesita sobrescribir la cabezera pues entra toda la lista completa cada vez que se escribe
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    //encontrando si existe ya existe ese amigo en la lista de amigos
    public boolean amigosRepetidos(String correo, ArrayList<Usuario> list) {
        for (Usuario usuario : list) {
            if (usuario.getCorreo().equals(correo.toLowerCase())) {
                return true;
            }
        }

        return false;
    }

    //obtener tus contactos de amigos y alamacenarlos en una lista
    public static ArrayList<Usuario> obtenerAmigos(String amigos) {
        ArrayList<Usuario> listaAmigos = new ArrayList<>();
        int min = 0;
        String nombre = "", correo = "";
        Usuario aux;
        for (int i = 0; i < amigos.length(); i++) {

            if (amigos.charAt(i) == ',') {

                for (int j = min; j < i; j++) {
                    nombre += amigos.charAt(j);

                }
                min = i + 1;
            }
            if (amigos.charAt(i) == ';') {
                for (int j = min; j < i; j++) {
                    correo += amigos.charAt(j);

                }
                aux = new Usuario(nombre, correo);
                listaAmigos.add(aux);
                nombre = "";
                correo = "";
                aux = null;
                min = i + 1;
            }

        }
        return listaAmigos;

    }
    //verificar claves para ingreso

    public Usuario ingresar(String correo, String clave) {

        for (Usuario aux : Usuario.listaUsuarios) {
            if (aux.getClave().equals(clave) && aux.getCorreo().equals(correo)) {
                return aux;
            }
        }

        return null;
    }

    //busca en la lista si ya existe el correo
    public boolean disponibilidad(String correo) {
        for (Usuario usuario : Usuario.listaUsuarios) {
            if (usuario.getCorreo().equals(correo)) {
                return false;
            }
        }
        return true;

    }

    //buscar por correo para este metodo me va retornar el usauio que se encuentrea en la lista listada
    public boolean encontrarUsuario(String correo) {
        for (Usuario usu : Usuario.listaUsuarios) {
            if (usu.getCorreo().equals(correo)) {
                return true;
            }

        }
        return false;

    }

    public Usuario encontrarUsuario1(String correo) {
        for (Usuario usu : Usuario.listaUsuarios) {
            if (usu.getCorreo().equals(correo)) {
                return usu;
            }

        }
        return null;

    }

    public Usuario encontrar(String correo) {
        for (Usuario usuario : Usuario.listaUsuarios) {
            if (usuario.getCorreo().equals(correo)) {
                Usuario aux = new Usuario(usuario.getNombre(), usuario.getCorreo());
                return aux;
            }

        }
        return null;

    }

}
