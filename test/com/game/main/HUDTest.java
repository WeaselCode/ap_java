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
public class HUDTest {
    
    public HUDTest() {
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
     * Test of tick method, of class HUD.
     */
    @Test
    public void testTick() {
        System.out.println("tick");
        HUD instance = new HUD();
        instance.tick();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of render method, of class HUD.
     */
    @Test
    public void testRender() {
        System.out.println("render");
        Graphics g = null;
        HUD instance = new HUD();
        instance.render(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of score method, of class HUD.
     */
    @Test
    public void testScore() {
        System.out.println("score");
        int score = 0;
        HUD instance = new HUD();
        instance.score(score);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScore method, of class HUD.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        HUD instance = new HUD();
        int expResult = 0;
        int result = instance.getScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLevel method, of class HUD.
     */
    @Test
    public void testGetLevel() {
        System.out.println("getLevel");
        HUD instance = new HUD();
        int expResult = 0;
        int result = instance.getLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLevel method, of class HUD.
     */
    @Test
    public void testSetLevel() {
        System.out.println("setLevel");
        int level = 0;
        HUD instance = new HUD();
        instance.setLevel(level);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
