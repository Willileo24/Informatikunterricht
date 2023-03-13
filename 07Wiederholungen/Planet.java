import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Planet extends World
{
    public Planet()
    {
        super(16, 12, 50);

        this.setPaintOrder(String.class, Rover.class, Marke.class, Gestein.class, Huegel.class);
        Greenfoot.setSpeed(20);
        
        this.addObject(new Rover(), 2, 2);
        this.addObject(new Gestein(), 12, 3);
    }  
}