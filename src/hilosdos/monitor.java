/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosdos;

/**
 *
 * @author pablo
 */
public class monitor extends Thread{
    //monitor m = new monitor();
    private int contenido;
    private boolean disponible = true;
    
    synchronized public int get(int quien){
        while(disponible == false){
            try{
                wait();
            }catch(InterruptedException e){
                
            }
        }
        disponible = false;
        System.out.format("Consumidor %2d consigue: %2d%n", quien, contenido);
        notifyAll();
        return contenido;
    }
    synchronized public void put(int quien, int value){
        while(disponible){
            try{
                wait();
            }catch(InterruptedException e){
                
            }
        }
        contenido = value;
        disponible = true;
        System.out.format("Productor %2d put: %2d%n", quien, contenido);
        notifyAll();
    }
}
