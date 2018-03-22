/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import city.cs.engine.*;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Naveed Farouq
 */
public class BgView extends UserView {
    
    private BufferedImage bg;
    Sonic sonic;

    public BgView(World w,Sonic sonic, int width, int height) {
        super(w, width, height);
        try {
            bg = ImageIO.read(new File("data/background1.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
       
        this.sonic = sonic;
    }
    
    public void paintBackground(Graphics2D g){
        super.paintBackground(g);
        g.drawImage(bg, 0, 0, this);
        g.drawString("Rings has been collected  :  " + sonic.getRingCount(), 10, 20);
        g.drawString("Poison has been collected :  " + sonic.getPoisonCount(), 10,40);
        g.drawString("Current Game Level     :  " + sonic.getLevel(), 10,60);
        g.drawString("Lives remaining         :  " + sonic.getLives(), 10,80);
    
        
      
    }
}
