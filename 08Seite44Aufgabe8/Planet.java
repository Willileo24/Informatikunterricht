import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Planet extends World
{
    public Planet()
    {
        super(16, 12, 50);

        this.setPaintOrder(String.class, Rover.class, Marke.class, Gestein.class, Huegel.class);
        Greenfoot.setSpeed(20); 
        
        for (int y = 11; y > 1; y--) {
            for (int x = 14 - y; x <= 12; x++) {
                this.addObject(new Huegel(), x, y);
            }
        }
        
        this.addObject(new Rover(), 2, 11);
    }  
}