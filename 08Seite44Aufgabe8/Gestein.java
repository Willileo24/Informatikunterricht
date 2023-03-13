import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Gestein extends Actor
{
    private String farbe;
    private int wassergehalt;

    public Gestein()
    {
        wassergehalt = Greenfoot.getRandomNumber(20);

        if (Greenfoot.getRandomNumber(2) == 0) {
            this.farbe = "rot";
            this.setImage("images/gesteinRot.png");
        }
        else {
            this.farbe = "blau";
            this.setImage("images/gesteinBlau.png");
        }
    }

    public void act() 
    {
        // Add your action code here.
    } 

    public int getWassergehalt()
    {
        return this.wassergehalt;
    }
}
