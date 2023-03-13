import greenfoot.*;

/**
 * @author (Willem E.)
 */
public class MyZoo extends World {

    public MyZoo() {    
        super(900, 600, 1);

        this.addObject(new Bee(), Greenfoot.getRandomNumber(800) + 50, Greenfoot.getRandomNumber(250) + 50);
        this.addObject(new Bee(), Greenfoot.getRandomNumber(800) + 50, Greenfoot.getRandomNumber(250) + 50);

        this.addObject(new Pig("a", "d"), Greenfoot.getRandomNumber(800) + 50, Greenfoot.getRandomNumber(250) + 300);
        this.addObject(new Pig("left", "right"), Greenfoot.getRandomNumber(800) + 50, Greenfoot.getRandomNumber(250) + 300);
    }
}