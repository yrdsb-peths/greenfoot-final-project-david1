import greenfoot.*; 
import java.util.concurrent.TimeUnit;

 // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public double Location_X = 225;
    public double Location_Y = 525;
    public double Speed = 100;
    public long startTime = System.currentTimeMillis();
    public long endTime = 0;
    public int random_Maxf = 450;
    public int random_Minf = 0;    
    public int interval = 1000;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(450, 650, 1); 
        
        airPlane airPlane = new airPlane();
        addObject(airPlane, (int)Location_X, (int)Location_Y);
        
        decision_Point point = new decision_Point();
        addObject(point, (int)Location_X, (int)Location_Y);
        
        

    }
    
    public void gameOver()
    {
        Label gameOver = new Label("Game Over", 100);
        addObject(gameOver, 225, 325);
        
    }
    

        
    }
    
        
    
