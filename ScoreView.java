package game;

import java.awt.Graphics2D;
import city.cs.engine.*;

/**
 * extended view
 */
public class ScoreView extends UserView {
    Sonic sonic;
        
    public ScoreView(World world, Sonic sonic, int width, int height) {
        super(world, width, height);
        this.sonic = sonic;
    }
    
    @Override
    protected void paintForeground(Graphics2D g) {
       g.drawString("Score: " + sonic.getRingCount(), 10, 120);
       
        
    }
}
