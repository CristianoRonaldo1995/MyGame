package game;

import city.cs.engine.*;

/**
 * Collision listener that allows the sonic to collect things.
 */
public class PickupPoison implements CollisionListener {
    private Sonic sonic;
    
    public PickupPoison(Sonic sonic) {
        this.sonic=sonic;
       
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() == sonic) {
            
            sonic.incrementPoisonCount();
            
            e.getReportingBody().destroy();
            
        }
    }
    
    
    
}
