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
public class Poison extends DynamicBody {

   private static final Shape shape = new CircleShape(0.7f);
   
    
    public Poison(World world) {
        super(world,shape);
        Shape headShape = new PolygonShape (0.321f,-0.048f, 0.299f,-0.321f, 0.032f,-0.495f, -0.218f,-0.421f, -0.341f,-0.15f, -0.313f,-0.014f);
        Fixture headFixture = new SolidFixture(this, headShape);
        
       Shape stampShape = new PolygonShape(-0.079f,0.493f, 0.099f,0.485f, 0.334f,-0.071f, -0.325f,-0.065f);
       Fixture stampFixture = new SolidFixture(this, stampShape);
        addImage(new BodyImage("data/poison.png",2));
    }
}
