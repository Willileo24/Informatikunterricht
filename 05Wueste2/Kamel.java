import greenfoot.*;

/**
 * @author (Willem E.)
 */
public class Kamel extends Actor {
    
    @Override
    public void act() {
        this.move(3);
        if (this.isAtEdge()) {
            this.turn(180);
            this.setImage("kamel_gruen.png");
        }
        
        if (Greenfoot.isKeyDown("tab")) {
            this.setImage("kamel_grau.png");
            Greenfoot.delay(10);
        }
    }    
}