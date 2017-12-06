package com.game.main;
/**we need a loop that performs 2 things:
 * it checks whether enough time has passed (1/60 sec)
 * to refresh the game, and checks whether enough time has passed (1 sec)
 * to refresh the FPS counter;
while 'running' it adds the time it took to go through one iteration
* of the loop it self and adds it to delta (which is simplified to 1)
* so once it reaches 1 delta it means enough time has passed to go forward one tick */

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;
/**
 *
 * @author Weasel
 */
public class Game extends Canvas implements Runnable{
    public static final int WIDTH = 640, HEIGHT = WIDTH / 12*9;
    
    private Thread thread;
    private boolean running = false;
    
    private Random r;
    private Handler handler;
    private HUD hud;

    public Game(){
        handler = new Handler();
        
        this.addKeyListener(new KeyInput(handler));
        
        new Window(WIDTH, HEIGHT, "Game Here", this);
        
        hud = new HUD();
        
        r = new Random();
        handler.addObject(new Player (WIDTH /2 -32, HEIGHT /2 - 32, ID.Player));
        for (int i = 0; i < 20; i++)
        handler.addObject(new BasicEnemy (r.nextInt(WIDTH),r.nextInt(HEIGHT), ID.BasicEnemy));
    }
    public synchronized void start(){
        thread = new Thread(this);
        thread.start();
        running = true;
    }
    public synchronized void stop(){
        try{
            thread.join();
            running = false;
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void run(){
       this.requestFocus();
       long lastTime = System.nanoTime();
       double amountOfTicks = 60.0;
       double ns = 1000000000 / amountOfTicks;
       double delta = 0;
       long timer = System.currentTimeMillis();
       int frames = 0;
       while(running){
           long now = System.nanoTime();
           delta += (now - lastTime) / ns;
           lastTime = now;
           while(delta >= 1){
               tick();
               delta--;
           }
           if(running)
               render();
           frames++;
           
           if(System.currentTimeMillis() - timer > 1000){
               timer += 1000;
               System.out.println("FPS: " + frames);
               frames = 0;
           }
       }
       stop();
    }
    private void tick(){
        handler.tick();
    }
    private void render(){
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null){
            this.createBufferStrategy(3);
            return;
        }
        
        Graphics g = bs.getDrawGraphics();
        
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        
        handler.render(g);
        
        hud.render(g);
        
        g.dispose();
        bs.show();
    }
    public static int clamp(int var, int min, int max){
        if(var >= max)
            return var = max;
        else if(var <= min)
            return var = min;
        else
            return var;
        
        
    }
    public static void main(String[] args) {
        new Game();
    }
    
}
