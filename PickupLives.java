package game;

import city.cs.engine.*;

/**
 * Collision listener that allows the sonic to collect things.
 */
public class PickupLives implements CollisionListener {
    private Sonic sonic;
    
    public PickupLives(Sonic sonic) {
        this.sonic=sonic;
        
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() == sonic) {
            
            sonic.incrementLivesCount();
            
            e.getReportingBody().destroy();
            
        }
    }
    
    
    
}
