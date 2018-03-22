package game;

import city.cs.engine.*;

/**
 * A Fire.
 */
public class Fire extends DynamicBody {

    private static final float radius = 0.75f;
    private static final Shape fireShape = new CircleShape(radius);
    private static final BodyImage fireImage =
        new BodyImage("data/fire.png", 2*radius);

    /**
     * Construct a Fire.
     * @param world the world in which this body exists.
     */
    public Fire(World world) {
        super(world, fireShape);
        addImage(fireImage);
    }
}
