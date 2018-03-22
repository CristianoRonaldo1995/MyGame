package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

import java.awt.Color;

/**
 *
 * @author Alireza Gorjiankhanzad
 */


/**
 * An Ring.
 */
 

public class Ring extends DynamicBody{ 
//public class Ring extends StaticBody {
    private static final Shape shape = new CircleShape(0.5f);
    private static final BodyImage Ring = new BodyImage("data/Ring.gif", 1f);
    
    public Ring(World world) {
        super(world, shape);
        setFillColor(Color.ORANGE);
        addImage(Ring);
    }
   
}
