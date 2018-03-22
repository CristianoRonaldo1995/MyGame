package game;

import city.cs.engine.*;

/**
 * Collision listener that allows the bird to collect things.
 */
public class PickupRing implements CollisionListener {
    private Sonic sonic;
    
    public PickupRing(Sonic sonic) {
        this.sonic = sonic;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() == sonic) {
            sonic.incrementRingCount();
            
            e.getReportingBody().destroy();
        }
        if(sonic.getLives()<1)
           System.exit(0);
            //sonic.destroy();
            //sonic.getWorld().stop();
        //sonic.getWorld().start();
    }
    
    
    
}
