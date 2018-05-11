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
    int n;
    monitor m;
    public consumidor(monitor m, int n){
        this.n = n;
        this.m = m;
    }
}
