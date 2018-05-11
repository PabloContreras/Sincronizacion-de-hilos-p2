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
public class consumidor extends Thread{
    private int numero;
    private monitor monitor;
    public consumidor(monitor monitor, int numero){
        this.numero = numero;
        this.monitor = monitor;
    }
    public void run(){
        int valor = 0;
        for (int i = 0; i < 10; i++) {
            valor = monitor.get(numero);
        }
    }
}
