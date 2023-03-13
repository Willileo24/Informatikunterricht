import greenfoot.*;

/**
 * @author (Willem E.) 
 */
public class Schlange extends Actor {
    
    @Override
    public void act() {
        if (Greenfoot.isKeyDown("right")) {
            this.turn(2);
        }
        
        if (Greenfoot.isKeyDown("left")) {
            this.turn(-2);
        }
        
        if (Greenfoot.isKeyDown("up")) {
            this.move(3);
        }
        
        if (Greenfoot.isKeyDown("down")) {
            this.move(-3);
        }
        
        if (Greenfoot.isKeyDown("x")) {
            this.setLocation(Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
            Greenfoot.delay(10);
        }
    }    
}