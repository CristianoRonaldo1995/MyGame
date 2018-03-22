package game;

import city.cs.engine.*;
import static game.Game.gameMusic;
import java.awt.Color;
import org.jbox2d.common.Vec2;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * Key handler to control an Walker.
 */
public class Controller extends KeyAdapter {
    private static final float JUMPING_SPEED = 15f;
    private static final float WALKING_SPEED = 6;
    
    private Walker body;
    
    public Controller(Walker body) {
        this.body = body;
    }
    
    public void setBody(Walker w){
        
        this.body = w;
    }
    
    /**
     * Handle key press events for walking and jumping.
     * @param e description of the key event
     */
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        
        switch(code){
            case KeyEvent.VK_Q  : // Q = quit
                                 System.exit(0);
                                 break;
            case KeyEvent.VK_UP :// 
            case KeyEvent.VK_SPACE : // space = jump
                                    Vec2 v = body.getLinearVelocity();
                                    // only jump if body is not already jumping
                                    if (Math.abs(v.y) < 0.01f) 
                                     body.jump(JUMPING_SPEED);
                                    
                                     
    
          
             try {
                 gameMusic = new SoundClip("data/Jump.wav");
                 gameMusic.play();
                 
               System.out.println("Working");// Open an audio input stream
             }
             catch (UnsupportedAudioFileException|IOException|LineUnavailableException em){
                 System.out.println(em);
             } 
         
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    break;
            case KeyEvent.VK_LEFT:// 
            case KeyEvent.VK_A  :// A = walk left
                                         body.startWalking(-WALKING_SPEED);
                                         break;
            case KeyEvent.VK_RIGHT :
            case KeyEvent.VK_D :// D = walk right
                                         body.startWalking(WALKING_SPEED);
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         break;
            case KeyEvent.VK_S:
                                        //Game game=new Game();
                                        body.getWorld().stop();
                                         //body.setPosition(new Vec2(-20, -16));
          
                                         break;
           case KeyEvent.VK_P:
                                        //Game game=new Game();
                                        body.getWorld().start();
                                       
                                         //body.setPosition(new Vec2(-20, -16));
          
                                         break;
            //case KeyEvent.
        }
    }
    
    /**
     * Handle key release events (stop walking).
     * @param e description of the key event
     */
    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        
        switch(code){
            case KeyEvent.VK_LEFT:// 
            case KeyEvent.VK_A  :// A = walk left
                                         body.stopWalking();
                                         break;
            case KeyEvent.VK_RIGHT :
            case KeyEvent.VK_D :// D = walk right
                                         body.stopWalking();
                                         break;
            
        }
    }
}
