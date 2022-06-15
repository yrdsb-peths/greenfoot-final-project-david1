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
    public double Location_X = 200;
    public double Location_Y = 500;
    public double Speed = 100;
    public int random_Maxf = 400;
    public int random_Minf = 0;    
    public int interval = 0;

    public SimpleTimerpublic Timer;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(450, 650, 1); 
        
        Decision_point red = new Decision_point();
        addObject(red, (int)Location_X, (int)Location_Y);
        
        
        Level_one();
    }
    
    public void Level_one()
    {
        interval = 500;
        //
        Level_one_bigBall oneb = new Level_one_bigBall();
        Level_one_smallBall ones = new Level_one_smallBall();
        SimpleTimerpublic Timers = new SimpleTimerpublic();
        Timers.mark();

        for(int i = 0; i < 20; i++)
        {
            int random_intf = (int)Math.floor(Math.random()*(random_Maxf-random_Minf+1)+random_Minf);
            
            if(Timers.millisElapsed() % 500 == 0)
            {
                ones = new Level_one_smallBall();
                addObject(ones, random_intf, 0);
            }
            
            random_intf = (int)Math.floor(Math.random()*(random_Maxf-random_Minf+1)+random_Minf);
            if(Timers.millisElapsed() % 500 == 0)
            {
                oneb = new Level_one_bigBall();
                addObject(oneb, random_intf, 0);
            }
            addObject(oneb, random_intf, 0);
            
        }
        
        
    }
    
        
    }
    
