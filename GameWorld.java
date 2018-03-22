package game;

import city.cs.engine.*;
import java.awt.Color;
import org.jbox2d.common.Vec2;

/**
 *
 * @author Naveed Farouq
 */

/**
 * A world with some bodies.
 */
public class GameWorld extends World {
    private Sonic sonic;
    private static final BodyImage brickImage = new BodyImage("data/brick.jpg", 20f);
    
   
    
    public GameWorld() {
        super();
        
               { // make a character
           
            sonic = new Sonic(this);
            sonic.setPosition(new Vec2(7, -11)); 
            
                        
        }
        { // make the ground
            Shape shape = new BoxShape(12, 1.5f);
            Body ground = new StaticBody(this, shape);
            ground.setPosition(new Vec2(0, -11.5f));
            ground.addImage(brickImage);
            ground.setClipped(true);
            
            Body Ring = new Ring(this);
            Ring.putOn(ground);  
            Ring.addCollisionListener(new PickupRing(sonic));
            
        }
        
        
        
         
        { // make platforms
            Shape shape = new BoxShape(1.5f, 0.5f);
            Shape shape2 = new BoxShape(5, 0.5f);
            
            Body platform1 = new StaticBody(this, shape);
            platform1.setPosition(new Vec2(5, -16.5f));
            platform1.addImage(brickImage);
            platform1.setClipped(true);
            
            
           
            
            Body platform2 = new StaticBody(this, shape);
            platform2.setPosition(new Vec2(12, -13.5f));
            platform2.addImage(brickImage);
            platform2.setClipped(true);
            
            Body platform3 = new StaticBody(this, shape2);
            platform3.setPosition(new Vec2(18, -13f));
            platform3.addImage(brickImage);
            platform3.setClipped(true);
            
            Body platform4 = new StaticBody(this, shape2);
            platform4.setPosition(new Vec2(5, -6.5f));
            platform4.addImage(brickImage);
            platform4.setClipped(true);
            
            Body platform5 = new StaticBody(this, shape2);
            platform5.setPosition(new Vec2(-7, -5.5f));
            platform5.addImage(brickImage);
            platform5.setClipped(true);
            
            Body platform6 = new StaticBody(this, shape2);
            platform6.setPosition(new Vec2(-13, 1f));
            platform6.addImage(brickImage);
            platform6.setClipped(true);
            
             Body platform7 = new StaticBody(this, shape);
            platform7.setPosition(new Vec2(-20, 4f));
            platform7.addImage(brickImage);
            platform7.setClipped(true);
            
             Body platform8 = new StaticBody(this, shape2);
            platform8.setPosition(new Vec2(-10, 6f));
            platform8.addImage(brickImage);
            platform8.setClipped(true);
            
             Body platform9 = new StaticBody(this, shape2);
            platform9.setPosition(new Vec2(-11, 5f));
            platform9.addImage(brickImage);
            platform9.setClipped(true);
            
            //................................ 
            
              Body Ring = new Ring(this);
              Ring.putOn(platform1);  
              Ring.addCollisionListener(new PickupRing(sonic));
              
              
              Ring = new Ring(this);
              Ring.putOn(platform2);
              Ring.addCollisionListener(new PickupRing(sonic));
              Ring = new Ring(this);
              Ring.putOn(platform3);
              Ring.addCollisionListener(new PickupRing(sonic));
              Ring = new Ring(this);
              Ring.putOn(platform4);
              Ring.addCollisionListener(new PickupRing(sonic));
              Ring = new Ring(this);
              Ring.putOn(platform5);
              Ring.addCollisionListener(new PickupRing(sonic));
              Ring = new Ring(this);
              Ring.putOn(platform6);
              Ring.addCollisionListener(new PickupRing(sonic));
              Ring = new Ring(this);
              Ring.putOn(platform7);
              Ring.addCollisionListener(new PickupRing(sonic));
              Ring = new Ring(this);
              Ring.putOn(platform8);
              Ring.addCollisionListener(new PickupRing(sonic));
              Ring.putOn(platform9);
              Ring.addCollisionListener(new PickupRing(sonic));
              Ring = new Ring(this);

             
        }
            
        

        {
            for (int i = 0; i < 12; i++) {
                Body poison = new Poison(this);
                poison.setPosition(new Vec2(i*2-8,8));
                poison.addCollisionListener(new PickupPoison(sonic));
            }
            
    }
              
        }
        ////////////////////////////////////////////////////////////
    public Sonic getPlayer() {
        return sonic;
    }
    
}
