/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Weasel
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.game.main.FastEnemyTest.class, com.game.main.HandlerTest.class, com.game.main.GameObjectTest.class, com.game.main.HUDTest.class, com.game.main.KeyInputTest.class, com.game.main.BasicEnemyTest.class, com.game.main.GameTest.class, com.game.main.PlayerTest.class, com.game.main.WindowTest.class, com.game.main.TrailTest.class, com.game.main.SpawnTest.class, com.game.main.SmartEnemyTest.class, com.game.main.IDTest.class})
public class MainSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
