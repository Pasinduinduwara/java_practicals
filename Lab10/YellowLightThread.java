
package com.mycompany.q1;

/**
 *
 * @author Induwara
 */
public class YellowLightThread extends Thread{
    public void run(){
        try {
             System.out.println("Yellow Light");
             Thread.sleep(2000);
         } catch (InterruptedException e) {
             System.out.println(e.getMessage());
         }
    }
    
}
