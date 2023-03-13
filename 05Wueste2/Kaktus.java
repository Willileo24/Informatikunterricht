import greenfoot.*;

/**
 * @author (Willem E.) 
 */
public class Kaktus extends Actor {
    
    int step = 2;
    
    @Override
    public void act() {
        this.setLocation(this.getX(), this.getY() + step);
        
        if (this.isAtEdge()) {
            if (step == 2) {
                step = -2;
            } else {
                step = 2;
            }
        }
    }    
}