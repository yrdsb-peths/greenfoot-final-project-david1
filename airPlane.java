import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class airPlane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class airPlane extends SmoothMover
{
    /**
     * Act - do whatever the airPlane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int enemyNumber;
    

    public void act()
    {
        moveControll();
        shootBullet();
        addTarget();
        
        // Add your action code here.
    }
    
    public airPlane()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 20, image.getHeight() - 20);
        setImage(image);
    }
    // Add your action code here.
    
    public void addTarget()
    {
        MyWorld world = (MyWorld) getWorld();
        int num = Greenfoot.getRandomNumber(world.interval);
        if(num<=50)
        {
            enemy enemy = new enemy();        
            int random_intf = (int)Math.floor(Math.random()*(world.random_Maxf-world.random_Minf+1)+world.random_Minf);
            
            world.addObject(enemy,random_intf,0);
            enemyNumber = enemyNumber + 1;
            if(world.interval == 0)
            {
                world.interval--;
            }
            
        }
    }
    
    public void moveControll()
    {
        MyWorld world = (MyWorld) getWorld();
        if(Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("shift"))
        {
            world.Location_X = world.Location_X - 1;
        } else if(Greenfoot.isKeyDown("left"))
        {
            world.Location_X = world.Location_X - 2;
        }
        
        if(Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("shift"))
        {
            world.Location_X = world.Location_X + 1;
        } else if(Greenfoot.isKeyDown("right"))
        {
            world.Location_X = world.Location_X + 2;
        }
        
        if(Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("shift"))
        {
            world.Location_Y = world.Location_Y - 1;
        } else if(Greenfoot.isKeyDown("up"))
        {
            world.Location_Y = world.Location_Y - 2;
        }
        
        if(Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("shift"))
        {
            world.Location_Y = world.Location_Y + 1;
        } else if(Greenfoot.isKeyDown("down"))
        {
            world.Location_Y = world.Location_Y + 2;
        }
        setLocation​((int)world.Location_X, (int)world.Location_Y);
    }
    
    
    
    public void shootBullet()
    {
        MyWorld world = (MyWorld) getWorld();
        
        
        if(Greenfoot.isKeyDown("z") && world.endTime - world.stratTime >= 100)
        {
            bullet bullet = new bullet();
            world.addObject(bullet, (int)world.Location_X, (int)world.Location_Y);
                
            world.endTime = System.currentTimeMillis();
        }else
        {
            world.stratTime = System.currentTimeMillis();
        }
    }
}

