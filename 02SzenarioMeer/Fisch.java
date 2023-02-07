import greenfoot.*;

/**
 * @author (Willem E.) 
 */
public class Fisch extends Actor {
    
    @Override
    public void act() {
        this.move(Greenfoot.getRandomNumber(10));
        if (this.isAtEdge()) {
            this.turn(55);
        }
    }    
}