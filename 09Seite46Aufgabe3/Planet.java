import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Planet extends World
{
    public Planet()
    {
        super(16, 12, 50);

        this.setPaintOrder(String.class, Rover.class, Marke.class, Gestein.class, Huegel.class);
        Greenfoot.setSpeed(20);
        
        for (int i = 0; i < 7; i++) {
            this.addObject(new Gestein(), 5 + i, 3);
        }
        
        this.addObject(new Rover(), Greenfoot.getRandomNumber(5), 3);
    }  
}