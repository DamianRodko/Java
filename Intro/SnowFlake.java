package Turtle;
import java.awt.Color;
public class SnowFlake
{
    public static void main(String []args)
    {
        int forward = 100;
        World newWorld = new World(800,800);
        Turtle yertle = new Turtle(newWorld);
        yertle.setColor(Color.RED); 
        yertle.setDelay(0.001);
        while (forward > 1)
        {
            yertle.forward(forward);
            yertle.turnRight(36);
            yertle.forward(forward);
            yertle.turnRight(36);
            yertle.forward(forward);
            yertle.turnRight(36);
            yertle.forward(forward);
            yertle.turnRight(36);
            yertle.forward(forward);
            yertle.turnRight(36);
            yertle.forward(forward);
            yertle.turnRight(36);
            yertle.forward(forward);
            yertle.turnRight(36);
            yertle.forward(forward);
            yertle.turnRight(36);
            yertle.forward(forward);
            yertle.turnRight(36);
            yertle.forward(forward);
            yertle.turnRight(144);
            forward--;
        }
    }
}