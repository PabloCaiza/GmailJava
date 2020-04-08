/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Usuario;
import Control.MyObjectOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pablo Caiza
 */
public class Archivo {
    
    public void eliminarArchivo(String direccion) throws IOException{
         File archivo=new File(direccion);
       
        if(archivo.exists()){
        archivo.delete();
            System.out.println("se elimino");
        }else{
            System.out.println("no existe");
        }
    }
    //modificar al archivo generar
    
    
    public void modificarGeneral(Usuario objetoOriginal,Usuario objetoModificado,String direccion,ArrayList list){
     
       int pos=list.indexOf(objetoOriginal);//sacamos la posicion del objeto original
        list.set(pos, objetoModificado); //modificamos al objeto 
  
        try {
            FileOutputStream file=new FileOutputStream(direccion);
            ObjectOutputStream escribir=new ObjectOutputStream(file);
            MyObjectOutputStream sobreEscribor = new MyObjectOutputStream(file);
            int i=0;
            //vamos a guardar la lista en el archivo general
            for (Object objeto : list) {
                if(i==0){//escribimos en el archivo
                    escribir.writeObject(objeto);
                }else{//sobreescribimos
                    sobreEscribor.writeObject(objeto);
                }
                i++;
            }
            //cerramos la escritura 
            escribir.close();
            sobreEscribor.close();
            
            
        } catch (FileNotFoundException ex) {
           
        } catch (IOException ex) {
            
        }
        
        
    }
    
    //mofifica al archivo personal de cada usuario
    public void modificar(Object objeto, String direccion) {

       try{ FileOutputStream archivo=new FileOutputStream(direccion);
        ObjectOutputStream escribir=new ObjectOutputStream(archivo);
        escribir.writeObject(objeto);
          escribir.close();
       }catch(FileNotFoundException e){
           
       }catch(IOException e){
        
    }

    }

    public void guardar(Object objeto, String direccion) throws FileNotFoundException, IOException {

        if (existenciaArchivo(direccion)) {
            FileOutputStream archivo = new FileOutputStream(direccion, true);
            MyObjectOutputStream escribir = new MyObjectOutputStream(archivo);
            escribir.writeObject(objeto);
            escribir.close();

        } else {
            FileOutputStream archivo = new FileOutputStream(direccion);
            ObjectOutputStream escribir = new ObjectOutputStream(archivo);
            escribir.writeObject(objeto);
            escribir.close();

        }

    }

    public void guardar(Object objeto, String direccion, ArrayList list) throws FileNotFoundException, IOException {
        list.add(objeto);
        if (existenciaArchivo(direccion)) {
            FileOutputStream archivo = new FileOutputStream(direccion, true);
            MyObjectOutputStream escribir = new MyObjectOutputStream(archivo);
            escribir.writeObject(objeto);
            escribir.close();

        } else {
            FileOutputStream archivo = new FileOutputStream(direccion);
            ObjectOutputStream escribir = new ObjectOutputStream(archivo);
            escribir.writeObject(objeto);
            escribir.close();

        }

    }

    public void listar(String dirrecion, ArrayList list) throws FileNotFoundException, IOException, ClassNotFoundException {
        try {
            FileInputStream archivo = new FileInputStream(dirrecion);
            ObjectInputStream leer = new ObjectInputStream(archivo);
            Object objeto = leer.readObject();
            while (objeto != null) {
                if (objeto instanceof Usuario) {
                    list.add((Usuario) objeto);
                }
                objeto = leer.readObject();
            }
        } catch (IOException e) {

        }

    }

    public Usuario listar(String dirrecion)  {
        try {
            FileInputStream archivo = new FileInputStream(dirrecion);
            ObjectInputStream leer = new ObjectInputStream(archivo);
            Object objeto = leer.readObject();
            while (objeto != null) {
                if (objeto instanceof Usuario) {
                    return (Usuario) objeto;
                }
                objeto = leer.readObject();
            }
        } catch (IOException e) {

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean existenciaArchivo(String direccion) {
        File archivo = new File(direccion);
        return archivo.exists();

    }
    
    /*Abrir Imagen*/
    public byte[]leerImagen(File archivo){
        byte[]imagen=new byte[1024*1000];
        try {
            FileInputStream entrada =new FileInputStream(archivo);
            entrada.read(imagen);//le el archivo y lo almacena en el arreglo de bytes
            
        } catch (Exception e) {
        }
        
        return imagen;
    }

}
