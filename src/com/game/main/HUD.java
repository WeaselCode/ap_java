/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.main;

import java.awt.Graphics;

/**
 *
 * @author Weasel
 */
import java.awt.Color;
public class HUD {
    public static int HEALTH = 100;
    
    public void tick(){
    
    }
    public void render(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(15, 15, 200, 32);
    }
    
}
