import java.util.Scanner;
public class EquationCalculator
{
	public static void main(String []args)
	{
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter operation: ");
            String operation = in.nextLine();
            System.out.println("Enter first operand: ");
            int firstOperand = in.nextInt();
            System.out.println("Enter second operand: ");
            int secondOperand = in.nextInt();
            int result = 0;
            switch(operation)
            {
                case "+" -> result = firstOperand + secondOperand;
                case "-" -> result = firstOperand - secondOperand;
                case "/" -> result = firstOperand / secondOperand;
                case "*" -> result = firstOperand * secondOperand;
            }
     
            System.out.println("Result: " + firstOperand + " " + operation + " " + secondOperand + " = " + result);
        }
    }
}