/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import javax.swing.JProgressBar;

/**
 *
 * @author Pablo Caiza
 */
public class Cargar extends Thread {
    private JProgressBar progreso;
    public Cargar(JProgressBar progreso){
       super();
       this.progreso=progreso;
       
    }
    @Override
    public void run(){
        for (int i = 0; i <= 100; i++) {
           progreso.setValue(i);
           pausa(10);
            
        }
    }
    public void pausa(int mlSeg){
        try{
            Thread.sleep(mlSeg);
        }catch(Exception e){
            
        }
    }
}
