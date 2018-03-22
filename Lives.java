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
public class Lives extends DynamicBody {

   private static final Shape shape = new CircleShape(0.7f);
   
    
    public Lives(World world) {
        super(world,shape);
        Shape capShape = new PolygonShape (0.322f,-0.047f, 0.298f,-0.32f, 0.031f,-0.496f, -0.219f,-0.422f, -0.342f,-0.16f, -0.314f,-0.01f);
        Fixture capFixture = new SolidFixture(this, capShape);
        
        
        
       Shape stemShape = new PolygonShape(-0.078f,0.492f, 0.098f,0.483f, 0.331f,-0.072f, -0.323f,-0.064f);
       Fixture stemFixture = new SolidFixture(this, stemShape);
        addImage(new BodyImage("data/lives.gif",2));
    }
}
