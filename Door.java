/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import city.cs.engine.BodyImage;
import city.cs.engine.BoxShape;
import city.cs.engine.Shape;
import city.cs.engine.StaticBody;
import city.cs.engine.World;

/**
 *
 * @author Alireza Gorjiankhanzad
 */
public class Door extends StaticBody {
    private static final Shape shape = new BoxShape(1.2f, 2f);
     
    public Door(World w) {
        super(w, shape);
        
        addImage(new BodyImage("data/door.gif", 4f));
    }
    
}
