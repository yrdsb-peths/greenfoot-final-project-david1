import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_one1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_one1 extends Actor
{
    /**
     * Act - do whatever the Level_one1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MyWorld world = (MyWorld) getWorld();
        setLocation​(getX(), getY()+1);	// Add your action code here.
    }
}
