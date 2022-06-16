import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Decision_point here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet extends airPlane
{
    /**
     * Act - do whatever the Decision_point wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() - 10);
        MyWorld world = (MyWorld) getWorld();
        if(getY() <= 0)
        {
            world.removeObject(this);
        }
    }
}
