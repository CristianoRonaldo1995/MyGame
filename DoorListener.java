/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

/**
 *
 * @author Alireza Gorjiankhanzad
 */
public class DoorListener implements CollisionListener {
    private Game game;
    
    public DoorListener(Game game){
        this.game = game;
    }
    
    public void collide(CollisionEvent e){
        if (e.getOtherBody() == game.getPlayer()){
            game.nextLevel();
        }
    }
    
}
