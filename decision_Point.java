import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class decision_Point here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class decision_Point extends airPlane
{
    /**
     * Act - do whatever the decision_Point wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveControll();
        gameOver();// Add your action code here.
    }
    
    public decision_Point()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 27, image.getHeight() - 27);
        setImage(image);
    }
    
    public void gameOver()
    {
        if(isTouching(enemy.class))
        {
            removeTouching(enemy.class);
            MyWorld world = (MyWorld) getWorld();
            Label gameOver = new Label("Game Over", 100);
            world.addObject(gameOver, 225, 325);
        }
    }
    
}
