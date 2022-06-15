import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_one here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_one extends Actor
{
    /**
     * Act - do whatever the Level_one wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    SimpleTimerpublic Timers = new SimpleTimerpublic();
    
    
    public void act()
    {
        MyWorld world = (MyWorld) getWorld();
        world.interval = 500;
        //
        bigBall oneb = new bigBall();
        smallBall ones = new smallBall();
        
        Timers.mark();
        int random_intf = (int)Math.floor(Math.random()*(world.random_Maxf-world.random_Minf+1)+world.random_Minf);
            
        while(Timers.millisElapsed() % 500 == 0)
        {
            ones = new smallBall();
            world.addObject(ones, random_intf, 0);
        }
            
        random_intf = (int)Math.floor(Math.random()*(world.random_Maxf-world.random_Minf+1)+world.random_Minf);
        while(Timers.millisElapsed() % 500 == 0)
        {
            oneb = new bigBall();
            world.addObject(oneb, random_intf, 0);
        }
    }
    
    
}
