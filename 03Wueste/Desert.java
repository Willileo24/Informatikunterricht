import greenfoot.*;

/**
 * @author (Willem E.)
 */
public class Desert extends World {
    
    public Desert() {    
        super(600, 400, 1); 
        
        prepare();
    }
    
    private void prepare() {
        this.addObject(new Kamel(), 123, 234);
        this.addObject(new Schlange(), 456, 321);
    }
}