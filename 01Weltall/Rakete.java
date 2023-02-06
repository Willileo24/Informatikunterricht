import greenfoot.*;

/**
 * @author (Willem E.)
 */
public class Rakete extends Actor {
    
    @Override
    public void act() {
        this.move(2);
        if (this.isAtEdge()) {
            this.turn(Greenfoot.getRandomNumber(360));
        }
    }    
}