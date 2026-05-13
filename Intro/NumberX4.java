package Math;
import java.util.Scanner;
public class NumberX4
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.print("Enter your 2-digit number: ");
        double number = in.nextDouble();
        double multiply;
        multiply = number * 4;
        System.out.print("Your end result is: " + multiply);
    }
}