import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Delfin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Delfin extends Actor
{
    final int jSpeed = 25;
    int ySpeed = 0, xSpeed = 0;
    boolean aboutFace;
    boolean onArena;
    /**
     * Act - do whatever the Delfin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moverse();
        eat();
        morir();
    }
    
    public void moverse()
    {
        move(2);
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(5);
        }
    }
    
    public void eat()
    {
        Actor pez;
        pez = getOneObjectAtOffset(0,0, Pez.class);
        if (pez != null)
        {
            World world;
            world = getWorld();
            world.removeObject(pez);
        }
    }
    
    public void morir()
    {
        Actor langosta;
        langosta = getOneObjectAtOffset(0,0, Langosta.class);
        if (langosta != null)
        {
            World world;
            world = getWorld();
            world.removeObject(langosta);
            move(0);
        }
    }
}
