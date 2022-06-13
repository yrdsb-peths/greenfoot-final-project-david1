import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Decision_point here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Decision_point extends Actor
{
    /**
     * Act - do whatever the Decision_point wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MyWorld world = (MyWorld) getWorld();
        if(Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("shift"))
        {
            world.setLocation(-2, 0);
        } else if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
        }
        
        if(Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("shift"))
        {
            move(2);
        } else if(Greenfoot.isKeyDown("right"))
        {
            move(5);
        }
        // Add your action code here.
    }
}
