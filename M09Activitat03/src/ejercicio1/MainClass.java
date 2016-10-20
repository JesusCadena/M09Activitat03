/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/**
 *
 * @author ALUMNEDAM
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
        ArrayList<Future<Boolean>> comprobar = new ArrayList();
        for (int i = 0; i <= 100; i++) {
            comprobar.add(executor.submit(new Tarea(i)));
        }
        for(Future<Boolean>f: comprobar){
            while(!f.isDone()){
            Thread.sleep(1000);
        }
        }
        for (int i = 4; i < comprobar.size(); i++) {
            if(comprobar.get(i).get()){
                System.out.println(i);
            }
        }
        executor.shutdown();
    }
    
}
