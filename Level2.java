/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import city.cs.engine.Body;
import city.cs.engine.BodyImage;
import city.cs.engine.BoxShape;
import city.cs.engine.Fixture;
import city.cs.engine.Shape;
import city.cs.engine.SolidFixture;
import city.cs.engine.StaticBody;
import org.jbox2d.common.Vec2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Alireza Gorjiankhanzad
 */
public class Level2 extends GameLevel implements ActionListener{
private Sonic sonic;
    private static final BodyImage brickImage = new BodyImage("data/brick.jpeg", 20f);
    
   private Timer timer;
    
    @Override
    public void populate(Game game){
        super.populate(game);
        timer = new Timer(4000, this);
        timer.setInitialDelay(120);
        timer.start();
     
        { // make the ground
            Shape shape = new BoxShape(11, 0.5f);
            Body ground = new StaticBody(this, shape);
            ground.setPosition(new Vec2(-12, -17.5f));
            ground.addImage(brickImage);
            ground.setClipped(true);
            
            Body Ring = new Ring(this);
            Ring.putOn(ground);  
            Ring.addCollisionListener(new PickupRing(getPlayer()));
            
        }
        
        
        
         
        { // make platforms
            Shape shape = new BoxShape(2f, 1.5f);
            Shape shape2 = new BoxShape(4, 1.5f);
            
            Body platform1 = new StaticBody(this, shape);
            platform1.setPosition(new Vec2(5, -17f));
            platform1.addImage(brickImage);
            platform1.setClipped(true);
            
            
           
            
            Body platform2 = new StaticBody(this, shape);
            platform2.setPosition(new Vec2(11, -13f));
            platform2.addImage(brickImage);
            platform2.setClipped(true);
            
            Body platform3 = new StaticBody(this, shape2);
            platform3.setPosition(new Vec2(20, -11f));
            platform3.addImage(brickImage);
            platform3.setClipped(true);
            
            Body platform4 = new StaticBody(this, shape2);
            platform4.setPosition(new Vec2(5, -7f));
            platform4.addImage(brickImage);
            platform4.setClipped(true);
            
            Body platform5 = new StaticBody(this, shape2);
            platform5.setPosition(new Vec2(-5, -3.5f));
            platform5.addImage(brickImage);
            platform5.setClipped(true);
            
            Body platform6 = new StaticBody(this, shape2);
            platform6.setPosition(new Vec2(-15, 1f));
            platform6.addImage(brickImage);
            platform6.setClipped(true);
            
             Body platform7 = new StaticBody(this, shape);
            platform7.setPosition(new Vec2(-22, 3.5f));
            platform7.addImage(brickImage);
            platform7.setClipped(true);
            
             Body platform8 = new StaticBody(this, shape2);
            platform8.setPosition(new Vec2(-13, 6f));
            platform8.addImage(brickImage);
            platform8.setClipped(true);
            
                 Body platform9 = new StaticBody(this, shape2);
            platform9.setPosition(new Vec2(1, 9f));
            platform9.addImage(brickImage);
            platform9.setClipped(true);
            
            
            
            //................................ 
            
              Body Ring = new Ring(this);
              Ring.putOn(platform1);  
              Ring.addCollisionListener(new PickupRing(getPlayer()));
              
              
              Ring = new Ring(this);
              Ring.putOn(platform2);
              Ring.addCollisionListener(new PickupRing(getPlayer()));
              Ring = new Ring(this);
              Ring.putOn(platform3);
              Ring.addCollisionListener(new PickupRing(getPlayer()));
              Ring = new Ring(this);
              Ring.putOn(platform4);
              Ring.addCollisionListener(new PickupRing(getPlayer()));
              Ring = new Ring(this);
              Ring.putOn(platform5);
              Ring.addCollisionListener(new PickupRing(getPlayer()));
              Ring = new Ring(this);
              Ring.putOn(platform6);
              Ring.addCollisionListener(new PickupRing(getPlayer()));
              Ring.addCollisionListener(new PickupRing(getPlayer()));
              Ring = new Ring(this);
              Ring.putOn(platform8);
              Ring.addCollisionListener(new PickupRing(getPlayer()));
              Ring.putOn(platform9);
              Ring.addCollisionListener(new PickupRing(getPlayer()));
            
              Body Lives = new Lives(this);
                
               
                Lives.putOn(platform7);
                Lives.addCollisionListener(new PickupLives(getPlayer()));
             
        }
            
        

        {
            for (int i = 0; i < 10; i++) {
                Body poison = new Poison(this);
                poison.setPosition(new Vec2(i*4-14,10));
                poison.addCollisionListener(new PickupPoison(getPlayer()));
            }
        }
        
        {
            Body Poison = new Poison(this);
            Poison.setPosition(new Vec2(-5, -5));
            Poison.addCollisionListener(new PickupPoison(getPlayer()));
      }
    }
         
         public void actionPerformed(ActionEvent ae) {
             {
            Body Poison = new Poison(this);
            Poison.setPosition(new Vec2(-6, -7));
            Poison.addCollisionListener(new PickupPoison(getPlayer()));
      }
}
   
    @Override
    public Vec2 startPosition() {
     return new Vec2(-21, -17);
    }

    
public Vec2 doorPosition() {
        return new Vec2(4, 12.5f);
    }
    
}
