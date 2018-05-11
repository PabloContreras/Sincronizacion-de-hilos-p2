/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosdos;

import static java.lang.Thread.sleep;

/**
 *
 * @author pablo
 */
public class productor {
    int numero;
    monitor monitor;
    public productor(monitor monitor, int numero){
        this.monitor = monitor;
        this.numero = numero;
    }
    public void run(){
        for (int i = 1; i <= 10; i++) {
            monitor.put(numero, i);
            try{
                sleep((int) (Math.random() * 100));
            }catch(InterruptedException e){
                
            }
        }
    }
    
}
