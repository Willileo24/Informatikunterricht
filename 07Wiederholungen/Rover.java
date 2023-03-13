import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rover extends Actor {
    private Display anzeige;

    @Override
    public void act() {
        while (!this.huegelVorhanden("rechts")) {
            this.fahre();
        }
        Greenfoot.stop();
    } 

    /**
     * Der Rover bewegt sich ein Feld in Fahrtrichtung weiter.
     * Sollte sich in Fahrtrichtung ein Objekt der Klasse Huegel befinden oder er sich an der Grenze der Welt befinden,
     * dann erscheint eine entsprechende Meldung auf dem Display.
     */
    public void fahre()
    {
        int posX = this.getX();
        int posY = this.getY();

        if(this.huegelVorhanden("vorne")) {
            this.nachricht("Zu steil!");
        }
        else { if (this.getRotation()==270 && this.getY()==1) {
                this.nachricht("Ich kann mich nicht bewegen");
            }
            else {
                this.move(1);
                Greenfoot.delay(1);
            }
        }
        if (posX==this.getX() && posY==this.getY() && !this.huegelVorhanden("vorne")) {
            this.nachricht("Ich kann mich nicht bewegen");
        }
    }

    /**
     * Der Rover dreht sich um 90 Grad in die Richtung, die mit richtung („links“ oder „rechts“) als Parameter übergeben wurde.
     * Sollte ein anderer Text (String) als "rechts" oder "links" übergeben werden, dann erscheint eine entsprechende Meldung auf dem Display.
     */
    public void drehe(String richtung)
    {
        if (richtung == "rechts") {
            this.setRotation(this.getRotation() + 90);
        } else {
            if (richtung == "links") {
                this.setRotation(this.getRotation() - 90);
            }
            else {
                this.nachricht("Befehl nicht korrekt!");
            }
        }
    }

    /**
     * Der Rover gibt durch einen Wahrheitswert (true oder false )zurück, ob sich auf seiner Position ein Objekt der Klasse Gestein befindet.
     * Eine entsprechende Meldung erscheint auch auf dem Display.
     */
    public boolean gesteinVorhanden()
    {
        if(this.getOneIntersectingObject(Gestein.class) != null) {
            this.nachricht("Gestein gefunden!");
            return true;
        }
        return false;
    }

    /**
     * Der Rover überprüft, ob sich in richtung ("rechts", "links", oder "vorne") ein Objekt der Klasse Huegel befindet.
     * Das Ergebnis wird auf dem Display angezeigt.
     * Sollte ein anderer Text (String) als "rechts", "links" oder "vorne" übergeben werden, dann erscheint eine entsprechende Meldung auf dem Display.
     */
    public boolean huegelVorhanden(String richtung)
    {
        int drehung = this.getRotation();

        if ((richtung=="vorne" && drehung==0) || (richtung=="rechts" && drehung==270) || (richtung=="links" && drehung==90)) {
            if(this.getOneObjectAtOffset(1,0,Huegel.class) != null && ((Huegel)getOneObjectAtOffset(1,0,Huegel.class)).getSteigung() > 30) {
                return true;
            }
        }

        if ((richtung=="vorne" && drehung==180) || (richtung=="rechts" && drehung==90) || (richtung=="links" && drehung==270)) {
            if(this.getOneObjectAtOffset(-1,0,Huegel.class)!=null && ((Huegel)getOneObjectAtOffset(-1,0,Huegel.class)).getSteigung() >30) {
                return true;
            }
        }

        if ((richtung=="vorne" && drehung==90) || (richtung=="rechts" && drehung==0) || (richtung=="links" && drehung==180)) {
            if(this.getOneObjectAtOffset(0,1,Huegel.class)!=null && ((Huegel)getOneObjectAtOffset(0,1,Huegel.class)).getSteigung() >30) {
                return true;
            }
        }

        if ((richtung=="vorne" && drehung==270) || (richtung=="rechts" && drehung==180) || (richtung=="links" && drehung==0)) {
            if(this.getOneObjectAtOffset(0,-1,Huegel.class)!=null && ((Huegel)getOneObjectAtOffset(0,-1,Huegel.class)).getSteigung() >30) {
                return true;
            }

        }

        if(richtung!="vorne" && richtung!="links" && richtung!="rechts")
        {
            this.nachricht("Befehl nicht korrekt!");
        }

        return false;
    }

    /**
     * Der Rover ermittelt den Wassergehalt des Gesteins auf seiner Position und gibt diesen auf dem Display aus.
     * Sollte kein Objekt der Klasse Gestein vorhanden sein, dann erscheint eine entsprechende Meldung auf dem Display.
     */
    public void analysiereGestein()
    {
        if (gesteinVorhanden()) {
            this.nachricht("Gestein untersucht! Wassergehalt ist " + ((Gestein)getOneIntersectingObject(Gestein.class)).getWassergehalt()+"%.");
            Greenfoot.delay(1);
            this.removeTouching(Gestein.class);
        } else {
            this.nachricht("Hier ist kein Gestein");
        }
    }

    /**
     * Der Rover erzeugt ein Objekt der Klasse „Markierung“ auf seiner Position.
     */
    public void setzeMarke()
    {
        this.getWorld().addObject(new Marke(), getX(), getY());
    }

    /**
     * *Der Rover gibt durch einen Wahrheitswert (true oder false )zurück, ob sich auf seiner Position ein Objekt der Marke befindet.
     * Eine entsprechende Meldung erscheint auch auf dem Display.
     */
    public boolean markeVorhanden()
    {
        if (this.getOneIntersectingObject(Marke.class) != null) {
            return true;
        } 
        return false;
    }

    public void entferneMarke()
    {
        if (this.markeVorhanden()){
            this.removeTouching(Marke.class);
        }
    }

    private void nachricht(String pText)
    {
        if (this.anzeige!=null) {
            this.anzeige.anzeigen(pText);
            Greenfoot.delay(1);
            this.anzeige.loeschen();
        }
    }

    private void displayAusschalten()
    {
        this.getWorld().removeObject(anzeige);

    }

    protected void addedToWorld(World world)
    {
        world = this.getWorld();

        this.setImage("images/rover.png");
        anzeige = new Display();
        world.addObject(anzeige, 7, 0);
        if(this.getY()==0) {
            this.setLocation(getX(),1);
        }
        this.anzeige.anzeigen("Ich bin bereit");
    }

    class Display extends Actor
    {
        GreenfootImage bild; 

        public Display()
        {
            this.bild = getImage();
        }

        public void anzeigen(String pText)
        {
            this.loeschen();
            this.bild = new GreenfootImage(pText, 30, null, null); 
            this.getImage().drawImage(bild, 8,0);
        }

        public void loeschen()
        {
            this.getImage().clear();
            this.setImage("images/nachricht.png");
        }

    }
}
