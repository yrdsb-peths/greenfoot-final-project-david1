import greenfoot.*; 
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
        super(400, 600, 1); 
        
        Decision_point red = new Decision_point();
        addObject(red, (int)Location_X, (int)Location_Y);
        
        SimpleTimerpublic Timer = new SimpleTimerpublic();
        Timer.mark();
        Level_one();
    }
    
    public void Level_one()
    {
        interval = 500;
        
        
        while(Timer.millisElapsed() % 500 == 0)
        {
            int random_intf = (int)Math.floor(Math.random()*(random_Maxf-random_Minf+1)+random_Minf);                //String smallBall = String.valueof (i_1);
            Level_one_smallBall smallBall = new Level_one_smallBall();
            addObject(smallBall, random_intf, 0);
            System.out.println(Timer.millisElapsed());
        }

        
    }
    
}
