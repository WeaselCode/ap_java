
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Weasel
 */
public class App {
    String [] args;
    App(String[] _args) {
        args = _args;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       App app = new App(args);
       app.run();
       
    }
    
    String able;
    String required;
    
    void readInput(Scanner in){
        able = in.nextLine();
        required = in.nextLine();
        
        if (able.length() < 1 || able.length() > 998) {
            throw new IllegalStateException("invalid value of able: "+able);
        }
        if (able.length() < 1 || able.length() > 998) {
            throw new IllegalStateException("invalid value of required: "+required);
        }  
    }
    
    void readInput(){
        Scanner in = new Scanner(System.in);
        readInput(in);
    }
    
    boolean success = false;
    
    void solveProblem(){
        if(able.length() -1 >= required.length()-1){
            success = true;
        } 
    }
    
    void writeOutput(){
        System.out.println(success ? "GO" : "NO");
        
    }
    void run() throws Exception {
        readInput();
        solveProblem();
        writeOutput();
    }
}
