import greenfoot.*;

/**
 * @author (Willem E.)
 */
public class Weltall extends World {
    public Weltall() {    
        super(600, 400, 1); 
        prepare();
    }
    
    private void prepare() {
        Rakete rakete = new Rakete();
        addObject(rakete,145,140);
        Rakete rakete2 = new Rakete();
        addObject(rakete2,184,236);
    }
}