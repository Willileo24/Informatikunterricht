import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Huegel extends Actor
{
    private int steigung;

    public Huegel()
    {
        this.steigung = Greenfoot.getRandomNumber(30) + 31;
        this.setImage("images/huegel.png");
    }

    public void act() 
    {
        // Add your action code here.
    } 

    public int getSteigung()
    {
        return this.steigung;
    }
}

