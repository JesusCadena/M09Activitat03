/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/**
 *
 * @author ALUMNEDAM
 */
public class Tarea implements Callable{  
    private int num ;
    private Boolean bolNum;
    public Tarea(int num) {
        this.num = num;
    }
    
    @Override
    public Object call() throws Exception {
       return (this.num%2==0)&&(this.num%3==0);
    
    } 
}
