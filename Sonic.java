package game;

import city.cs.engine.*;

/**
 * Simple character
 */
public class Sonic extends Walker {

    
    private static final Shape shape = new PolygonShape(
            -0.99f,1.02f, -1.02f,0.29f, -0.37f,-1.48f, 1.03f,-1.47f, 1.0f,0.49f, 0.76f,1.46f);

    private static final BodyImage image = new BodyImage("data/sonic.png", 3f);
    

    private int RingCount;
    private int poisonCount;
    private int lives;
    private int level;
    private int Flower;
    
    public Sonic(World world) {
        super(world, shape);
                SolidFixture fixture = new SolidFixture(this, shape, 5);
                fixture.setFriction(8f);
       addImage(image);
        
        Flower=0;
        RingCount = 0;
        poisonCount=0;
        lives=5;
        
    }
    public void setLevel(int l) {
        level=l;
        
    }
public int getLevel() {
        return level;
        
    }

public int getRingCount() {
        return RingCount;
        
    }
    
    public int getFlowerCount() {
        return Flower;   
    }
    
    public int getLives() {
        return lives;
        
    }
    
    public int getPoisonCount() {
        return poisonCount;
    }

    public void incrementRingCount() {
        RingCount++;
        
        
        System.out.println("well done you've got the ring!  your new score is = " + RingCount);
    }
    
    public void incrementPoisonCount() {
        poisonCount++;
        lives--;
        System.out.println("sorry you've lost 1 life" + poisonCount);
    }
    
    public void incrementLivesCount(){
        lives++;
        System.out.println("oh!! poisoned mushroom, number of Lives = " + lives);
    }
    
       public void incrementFlowerCount() {
        Flower++;
        
        
        System.out.println(" Flower = " + Flower);
    }
    
}
