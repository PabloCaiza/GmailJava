/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Grupo;
import Modelo.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Pablo Caiza
 */
public class GrupoTrs {
        
    /*no permitir grupos con el mismo nombre*/
    public boolean disponibilidadGrupo(ArrayList<Grupo>list,String nombre){
        for (Grupo grupo : list) {
            if(grupo.getNombre().equals(nombre)){
                return false;
            }
        }
        return true;
    }
    
      public Usuario buscarAmigo(ArrayList<Usuario> list, String correo) {
        for (Usuario usu : list) {
            if (usu.getCorreo() == correo) {
                return usu;
            }

        }
        return null;

    }

    public boolean disponibilidad(ArrayList<Usuario> list, String correo) {
        for (Usuario usu : list) {
            if (usu.getCorreo() == correo) {
                return false;
            }

        }
        return true;

    }
}
