import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Decision_point here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Decision_point extends SmoothMover
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
            world.Location_X = world.Location_X - 2;
        } else if(Greenfoot.isKeyDown("left"))
        {
            world.Location_X = world.Location_X - 5;
        }
        
        if(Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("shift"))
        {
            world.Location_X = world.Location_X + 2;
        } else if(Greenfoot.isKeyDown("right"))
        {
            world.Location_X = world.Location_X + 5;
        }
        
        if(Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("shift"))
        {
            world.Location_Y = world.Location_Y - 2;
        } else if(Greenfoot.isKeyDown("up"))
        {
            world.Location_Y = world.Location_Y - 5;
        }
        
        if(Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("shift"))
        {
            world.Location_Y = world.Location_Y + 2;
        } else if(Greenfoot.isKeyDown("down"))
        {
            world.Location_Y = world.Location_Y + 5;
        }
        setLocation​(world.Location_X, world.Location_Y);
        // Add your action code here.
    }
    public Decision_point()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 30, image.getHeight() - 30);
        setImage(image);
    }
}
