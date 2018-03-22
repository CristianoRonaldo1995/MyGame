/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

/**
 *
 * @author Alireza Gorjiankhanzad
 */
public abstract class GameLevel extends World {
    private Sonic sonic;
    
    
    
    public void populate(Game game){
        sonic = new Sonic(this);
        sonic.setPosition(startPosition());
        
        Door door = new Door(this);
        door.setPosition(doorPosition());
        door.addCollisionListener(new DoorListener(game));
        
        
    }
    
    public abstract Vec2 startPosition();
    
    public abstract Vec2 doorPosition();
    
    public Sonic getPlayer(){
        return sonic;
    }
    
}
