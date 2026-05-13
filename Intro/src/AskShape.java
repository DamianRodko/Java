package Turtle;
import java.awt.Color;
import java.util.Scanner;
public class AskShape
{
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        World newWorld = new World(800,800);
        Turtle yertle = new Turtle(newWorld);
        yertle.setColor(Color.RED); 
        yertle.setDelay(0.001);
        System.out.print("Enter number of sides: ");
        int sides = in.nextInt();
        int degrees = 360 / sides;
        int count = 1;
        while (count <= sides)
        {
            yertle.turnRight(degrees);
            yertle.forward(30);
            count++;
        }
    }
}