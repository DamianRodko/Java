import javax.swing.JOptionPane;
public class LearningConditionals
{
    public static void main(String []args)
    {
        /*
        Scanner:
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Your number times 2 is: " + (num * 2));
        
        Swing:
        String input = JOptionPane.showInputDialog("Enter a number");
        int num = Integer.parseInt(input);
        System.out.println(num * 2);
        */
        String input = JOptionPane.showInputDialog("Enter your age");
        System.out.println("You entered: " + input);
        int num = Integer.parseInt(input);
        if(num >= 16)
        {
            System.out.println("You are eligible for your permit");
        }
        else
        {
            System.out.println("You are ineligible for your permit");
        }
        if(num%2 == 0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
}
