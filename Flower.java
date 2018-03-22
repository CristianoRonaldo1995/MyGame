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
public class Flower extends DynamicBody {

    public Flower(World w) {
        super(w);
    
    
    Shape headShape = new PolygonShape (-0.844f,0.545f, -0.386f,0.963f, 0.237f,0.975f, 0.726f,0.707f, 0.869f,0.184f, 0.433f,-0.293f, -0.411f,-0.299f, -0.822f,0.056f);
    Fixture headFixture = new SolidFixture(this, headShape);
    
    
    Shape stampShape = new PolygonShape (0.109f,-0.358f, 0.134f,-0.991f, -0.131f,-0.984f, -0.103f,-0.361f);
    Fixture stampFixture = new SolidFixture(this, stampShape);
    
    
    Shape RightLeafShape = new PolygonShape (0.121f,-0.704f, 0.352f,-0.364f, 0.72f,-0.333f, 0.922f,-0.442f, 0.813f,-0.794f, 0.542f,-0.919f, 0.305f,-0.953f, 0.112f,-0.922f);
    Fixture RightLeafFixture = new SolidFixture(this, RightLeafShape);
    
    
    Shape LeftLeafShape = new PolygonShape (-0.121f,-0.692f, -0.336f,-0.374f, -0.682f,-0.324f, -0.928f,-0.43f, -0.879f,-0.71f, -0.607f,-0.9f, -0.318f,-0.947f, -0.109f,-0.928f);
    Fixture LeftLeafFixture = new SolidFixture(this, LeftLeafShape);
    
    
    addImage(new BodyImage("data/flower.png", 2));
    }
}
