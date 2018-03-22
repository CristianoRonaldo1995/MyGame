package game;

import city.cs.engine.*;

/**
 * Collision listener that allows the sonic to collect things.
 */
public class PickupFlower implements CollisionListener {
    private Sonic sonic;
    
    public PickupFlower(Sonic sonic) {
        this.sonic=sonic;
        
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() == sonic) {
            
            sonic.incrementFlowerCount();
            
            e.getReportingBody().destroy();
            
        }
    }
    
    
    
}
