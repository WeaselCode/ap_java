/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weasel
 */
public class AppTest {
    
    public AppTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class App.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main untested");
        
    }

    /**
     * Test of readInput method, of class App.
     */
    @Test
    public void testReadInput_Scanner() {
        System.out.println("readInput");
        Scanner in = new Scanner("aaah\n" + "aah");
        App app = new App(new String[]{});
        app.readInput(in);
        assertEquals("aaah", app.able);
        assertEquals("aah" , app.required);
    }

    /**
     * Test of solveProblem method, of class App.
     */
    @Test
    public void testSolveProblem() {
        System.out.println("solveProblem");
        App app = new App(new String[]{});
        Scanner in = new Scanner("aaah\n" + "aah");
        app.readInput(in);
        app.solveProblem();
        assertEquals(true, app.success);
    }
    
    /**
     * Test of solveProblem method, of class App.
     */
    @Test
    public void testSolveProblem0() {
        System.out.println("solveProblem");
        App app = new App(new String[]{});
        Scanner in = new Scanner("aaah\n" + "aaaaah");
        app.readInput(in);
        app.solveProblem();
        assertEquals(false, app.success);
    }

    /**
     * Test of writeOutput method, of class App.
     */
    @Test
    public void testWriteOutput() {
        System.out.println("writeOutput untested");
    }

    /**
     * Test of run method, of class App.
     */
    @Test
    public void testRun() throws Exception {
        System.out.println("run untested");
    }   
}
