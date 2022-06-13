import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        Decision_point red = new Decision_point();
        addObject(red, 200, 500);
    }
    
    public void Level_one()
    {
        pizza pizza1 = new pizza();
        int random_Maxf = 600;
        int random_Minf = 0;        
        int random_intf = (int)Math.floor(Math.random()*(random_Maxf-random_Minf+1)+random_Minf);

        addObject(pizza1, random_intf, 0);
    }
}
