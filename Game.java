package game;

import city.cs.engine.*;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.*;


import javax.swing.JFrame;


/**
 * The computer game.
 */
public class Game {
 
    
    
    private GameLevel world;

   private BgView view;
   private int level;
   private Controller controller;
   
    //private GameWorld world;
     private static final Color skyColour = new Color(225, 240, 255);
   
    
    /** A graphical display of the world (a specialised JPanel). */
  //  private UserView view;
    

    /** Initialise a new Game. */
    public Game() {

        // make the world
        world = new Level1();
        level = 1;
        world.populate(this);
        
         //GameWorld world = new GameWorld();
       Sonic sonic = world.getPlayer();
       sonic.setLevel(1);
   
       view = new BgView(world,sonic, 950, 700); 

        

        // display the view in a frame
        final JFrame frame = new JFrame("Naveed Farouq's sonic Game");
       
       
        
        // quit the application when the game window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        // display the world in the window
        frame.add(view);
        // don't let the game window be resized
        frame.setResizable(false);
        // size the game window to fit the world view
        frame.pack();
        // make the window visible
        frame.setVisible(true);
        // get keyboard focus
        frame.requestFocus();
        // give keyboard focus to the frame whenever the mouse enters the view
        view.addMouseListener(new GiveFocus(frame));
        
        
        
        
        controller = new Controller(world.getPlayer());
        frame.addKeyListener(controller);
        

        // uncomment this to make a debugging view
        //JFrame debugView = new DebugViewer(world, 1000, 800);

        // start!
        world.start();
    }

    public Sonic getPlayer(){
        return world.getPlayer();
    }
    
    public static SoundClip gameMusic;
    
         static {
             try {
                 gameMusic = new SoundClip("data/SonicMusic.wav");
                 gameMusic.play();
                 
               System.out.println("Working");// Open an audio input stream
             }
             catch (UnsupportedAudioFileException|IOException|LineUnavailableException em){
                 System.out.println(em);
             } 
         }
    

    public void nextLevel(){
    try {
                 gameMusic = new SoundClip("data/NextLevel.wav");
                 gameMusic.play();
                 
               System.out.println("Working");// Open an audio input stream
             }
             catch (UnsupportedAudioFileException|IOException|LineUnavailableException em){
                 System.out.println(em);
             } 
         
    
        System.out.println("Going to the next level...");
        world.stop();
        level++;
        switch(level){
            case 1:break;
            case 2:
                world = new Level2();
                world.populate(this);
                controller.setBody(world.getPlayer());
                view.setWorld(world);
              
                world.getPlayer().setLevel(2);
                world.start();
                break;
            case 3:
                world = new Level3();
                world.populate(this);
                controller.setBody(world.getPlayer());
                view.setWorld(world);
                world.start();
                break;
            case 4:  
                  System.exit(0);
                  break;
        }
        
    }
    
    
    
    /** Run the game. */
    public static void main(String[] args) {
        Game game = new Game();
     
        
    }
}
