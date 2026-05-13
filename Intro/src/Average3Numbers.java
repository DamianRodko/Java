import java.util.Scanner;
public class Average3Numbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.print("Enter your first number: ");
        double firstNumber = in.nextDouble();
        System.out.print("Enter your second number: ");
        double secondNumber = in.nextDouble();
        System.out.print("Enter your third number: ");
        double thirdNumber = in.nextDouble();
        double average;
        average = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.print("The average of your three numbers is: " + average);
    }
}