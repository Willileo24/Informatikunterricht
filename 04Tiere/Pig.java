import greenfoot.*;

/**
 * @author (Willem E.)
 */
public class Pig extends Actor {
    
    String keyLeft;
    String keyRight;
    
    public Pig(String keyLeft, String keyRight) {
        this.keyLeft = keyLeft;
        this.keyRight = keyRight;
    }
    
    @Override
    public void act() {
        if (Greenfoot.isKeyDown(this.keyLeft)) {
            this.setRotation(180);
            this.move(3);
        }
        
        if (Greenfoot.isKeyDown(this.keyRight)) {
            this.setRotation(0);
            this.move(3);
        }
    }
}