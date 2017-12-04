/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Weasel
 */
import java.util.*;
public class Test implements Runnable {
    String name;
    int time;
    Random r = new Random();
    public Test(String s){
        name = s;
        time = r.nextInt(999);
    }
    
    public void run(){
        try{
            System.out.printf("%s is sleeping for %d\n", name, time);
            Thread.sleep(time);
            System.out.printf("%s woke up\n", name);
        }catch(Exception e){}
    }
    
}
