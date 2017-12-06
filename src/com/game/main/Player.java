/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author Weasel
 */
public class Player extends GameObject {
    Random r = new Random();
    public Player(int x, int y, ID id) {
        super(x, y, id);

    }

    @Override
    public void tick() {
      x += velX;
      y += velY;
      x = Game.clamp(x, 0, Game.WIDTH -32);
      y = Game.clamp(y, 0, Game.HEIGHT -64);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x, y, 32, 32);
    }
    
}
