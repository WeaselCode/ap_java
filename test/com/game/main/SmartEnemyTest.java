/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.main;

import java.awt.Graphics;
import java.awt.Rectangle;
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
public class SmartEnemyTest {
    
    public SmartEnemyTest() {
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
     * Test of getBounds method, of class SmartEnemy.
     */
    @Test
    public void testGetBounds() {
        System.out.println("getBounds");
        SmartEnemy instance = null;
        Rectangle expResult = null;
        Rectangle result = instance.getBounds();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tick method, of class SmartEnemy.
     */
    @Test
    public void testTick() {
        System.out.println("tick");
        SmartEnemy instance = null;
        instance.tick();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of render method, of class SmartEnemy.
     */
    @Test
    public void testRender() {
        System.out.println("render");
        Graphics g = null;
        SmartEnemy instance = null;
        instance.render(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
