/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.main;

import java.awt.Graphics;
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
public class HandlerTest {
    
    public HandlerTest() {
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
     * Test of tick method, of class Handler.
     */
    @Test
    public void testTick() {
        System.out.println("tick");
        Handler instance = new Handler();
        instance.tick();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of render method, of class Handler.
     */
    @Test
    public void testRender() {
        System.out.println("render");
        Graphics g = null;
        Handler instance = new Handler();
        instance.render(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addObject method, of class Handler.
     */
    @Test
    public void testAddObject() {
        System.out.println("addObject");
        GameObject object = null;
        Handler instance = new Handler();
        instance.addObject(object);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeObject method, of class Handler.
     */
    @Test
    public void testRemoveObject() {
        System.out.println("removeObject");
        GameObject object = null;
        Handler instance = new Handler();
        instance.removeObject(object);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
