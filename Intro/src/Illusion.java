package Turtle;
import java.awt.Color;
public class Illusion {
    public static void main(String[] args)
    {
       World newWorld = new World(800,800);
       Turtle yertle = new Turtle(newWorld);
       yertle.setColor(Color.RED); 
       yertle.setDelay(0.001);
        
        yertle.turnLeft(36);
        yertle.forward(100);
        yertle.turnRight(72);
        yertle.forward(100);
        yertle.turnRight(108);
        yertle.forward(100);
        yertle.turnRight(72);
        yertle.forward(100);
        yertle.backward(100);
        yertle.turnRight(234);
        yertle.forward(100);
        yertle.turnLeft(126);
        yertle.forward(100);
        yertle.turnRight(72);
        yertle.forward(100);
        yertle.turnRight(108);
        yertle.forward(100);
        yertle.turnRight(72);
        yertle.forward(200);
        yertle.turnRight(54);
        yertle.forward(100);
        yertle.turnRight(126);
        yertle.forward(100);
        yertle.turnLeft(72);
        yertle.forward(100);
        yertle.turnRight(126);
        yertle.forward(100);
        yertle.backward(100);
        yertle.turnLeft(126);
        yertle.forward(100);
        yertle.turnRight(72);
        yertle.forward(100);
        yertle.turnRight(108);
        yertle.forward(100);
        yertle.turnRight(72);
        yertle.forward(100);
        yertle.turnLeft(126);
        yertle.forward(100);
        yertle.turnLeft(54);
        yertle.forward(100);
        yertle.turnLeft(126);
        yertle.forward(100);
        yertle.backward(100);
        yertle.turnRight(54);
        yertle.forward(100);
        yertle.turnLeft(54);
        yertle.forward(100);
    }
}
