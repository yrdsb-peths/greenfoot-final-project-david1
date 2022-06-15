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
    public int random_intf;
    public SimpleTimerpublic Timer;
    SimpleTimerpublic Timers = new SimpleTimerpublic();
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
        bigBall oneb = new bigBall();
        smallBall ones = new smallBall();
        
        Timers.mark();
        
        random_intf = (int)Math.floor(Math.random()*(random_Maxf-random_Minf+1)+random_Minf);
        //change the place of the ball ramdom
        while(Timers.millisElapsed() % 500 == 0)//per 0.5c        
        {
            ones = new smallBall();
           addObject(ones, random_intf, 0);
        }
            
        random_intf = (int)Math.floor(Math.random()*(random_Maxf-random_Minf+1)+random_Minf);
        //change the place of the ball ramdom
        while(Timers.millisElapsed() % 500 == 0)//per 0.5c        
        {
            oneb = new bigBall();
            addObject(oneb, random_intf, 0);
        }
            //addObject(oneb, random_intf, 0);
        System.out.println(Timers.millisElapsed());
    }    
        
    }
    
        
    
