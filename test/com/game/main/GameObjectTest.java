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
public class GameObjectTest {
    
    public GameObjectTest() {
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
     * Test of tick method, of class GameObject.
     */
    @Test
    public void testTick() {
        System.out.println("tick");
        GameObject instance = null;
        instance.tick();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of render method, of class GameObject.
     */
    @Test
    public void testRender() {
        System.out.println("render");
        Graphics g = null;
        GameObject instance = null;
        instance.render(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBounds method, of class GameObject.
     */
    @Test
    public void testGetBounds() {
        System.out.println("getBounds");
        GameObject instance = null;
        Rectangle expResult = null;
        Rectangle result = instance.getBounds();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setX method, of class GameObject.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 0;
        GameObject instance = null;
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class GameObject.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 0;
        GameObject instance = null;
        instance.setY(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getX method, of class GameObject.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        GameObject instance = null;
        float expResult = 0.0F;
        float result = instance.getX();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class GameObject.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        GameObject instance = null;
        float expResult = 0.0F;
        float result = instance.getY();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class GameObject.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        ID id = null;
        GameObject instance = null;
        instance.setID(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class GameObject.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        GameObject instance = null;
        ID expResult = null;
        ID result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVelX method, of class GameObject.
     */
    @Test
    public void testSetVelX() {
        System.out.println("setVelX");
        int velX = 0;
        GameObject instance = null;
        instance.setVelX(velX);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVelY method, of class GameObject.
     */
    @Test
    public void testSetVelY() {
        System.out.println("setVelY");
        int velY = 0;
        GameObject instance = null;
        instance.setVelY(velY);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVelX method, of class GameObject.
     */
    @Test
    public void testGetVelX() {
        System.out.println("getVelX");
        GameObject instance = null;
        float expResult = 0.0F;
        float result = instance.getVelX();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVelY method, of class GameObject.
     */
    @Test
    public void testGetVelY() {
        System.out.println("getVelY");
        GameObject instance = null;
        float expResult = 0.0F;
        float result = instance.getVelY();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class GameObjectImpl extends GameObject {

        public GameObjectImpl() {
            super(0.0F, 0.0F, null);
        }

        public void tick() {
        }

        public void render(Graphics g) {
        }

        public Rectangle getBounds() {
            return null;
        }
    }
    
}
