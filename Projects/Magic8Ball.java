package Games;
import java.util.Scanner;
public class Magic8Ball
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Ask the question: ");
        String userInput = input.nextLine();
        int num = (int) (Math.random() * 6);
        if(num == 1)
        {
            System.out.println("It is cerain");
        }
        else if(num == 2)
        {
            System.out.println("It is decidedly so");
        }
        else if(num == 3)
        {
            System.out.println("Ask again later");
        }
        else if(num == 4)
        {
            System.out.println("Cannot predict now");
        }
        else if(num == 5)
        {
            System.out.println("My reply is no");
        }
        else
        {
            System.out.println("Don't count on it");
        }
    }
}
