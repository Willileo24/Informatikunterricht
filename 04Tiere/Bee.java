import greenfoot.*;

/**
 * @author (Willem E.)
 */
public class Bee extends Actor {
    
    @Override
    public void act() {
        this.move(3);
        
        if (this.isAtEdge()) {
            this.turn(180);
        }
    }    
}