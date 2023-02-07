import greenfoot.*;

/**
 * @author (Willem E.) 
 */
public class Ocean extends World {

    public Ocean() {
        super(600, 400, 1); 
        prepare();
    }
    
    private void prepare() {
        Fisch fisch = new Fisch();
        addObject(fisch,123,75);
        
        Fisch fisch2 = new Fisch();
        addObject(fisch2,348,77);
        
        Fisch fisch3 = new Fisch();
        addObject(fisch3,490,241);
        
        Fisch fisch4 = new Fisch();
        addObject(fisch4,178,260);
        
        fisch2.setLocation(362,102);
        fisch3.setLocation(475,262);
        fisch4.setLocation(155,244);
        fisch3.setLocation(472,277);
    }
}