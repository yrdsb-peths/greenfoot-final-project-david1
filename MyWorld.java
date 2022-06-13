import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        Level_one();
    }
    
    
}
