import java.util.Scanner;
public class BMICalculator
{
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        boolean continuePlaying = true;
        while (continuePlaying)
        {
            System.out.println("Enter Imperial or Metric: ");
            String choice = in.nextLine().toUpperCase();
            if (choice.equals("IMPERIAL"))
            {
                System.out.println("Enter feet: ");
                double heightFeet = in.nextDouble();
                System.out.println("Enter inches: ");
                double heightInch = in.nextDouble();
                System.out.println("Enter pounds: ");
                double weight = in.nextDouble();
                double heightTotalInch;
                heightTotalInch = (heightFeet * 12) + heightInch;
                double bmi;
                bmi = (weight / (heightTotalInch * heightTotalInch)) * 703;
                
                if (bmi < 18.5)
                {
                    System.out.println("Your BMI is: " + Math.round(bmi * 100)/100.0 + " and you are underweight.");
                }
                else if(bmi > 18.5 && bmi < 24.9)
                {
                    System.out.println("Your BMI is: " + Math.round(bmi * 100)/100.0 + " and you are normal.");
                }
                else if(bmi > 25 && bmi < 29.9)
                {
                    System.out.println("Your BMI is: " + Math.round(bmi * 100)/100.0 + " and you are overweight.");
                }
                else
                {
                    System.out.println("Your BMI is: " + Math.round(bmi * 100)/100.0 + " and you are obese.");
                }
            }
            else
            {
                System.out.println("Enter your height(centimeters): ");
                double height = in.nextDouble();
                System.out.println("Enter your weight(kilograms): ");
                double weight = in.nextDouble();
                double bmi;
                height = height / 100;
                bmi = (weight / (height * height));
                
                if (bmi < 18.5)
                {
                    System.out.println("Your BMI is: " + Math.round(bmi * 100)/100.0 + " and you are underweight.");
                }
                else if(bmi > 18.5 && bmi < 24.9)
                {
                    System.out.println("Your BMI is: " + Math.round(bmi * 100)/100.0 + " and you are normal.");
                }
                else if(bmi > 25 && bmi < 29.9)
                {
                    System.out.println("Your BMI is: " + Math.round(bmi * 100)/100.0 + " and you are overweight.");
                }
                else
                {
                    System.out.println("Your BMI is: " + Math.round(bmi * 100)/100.0 + " and you are obese.");
                }
            }
            System.out.println("Do you want to keep going? Y/N");
            in.nextLine();
            String restart = in.nextLine().toUpperCase();
            if (restart.equals("Y"))
            {
                continuePlaying = true;
            }
            else
            {
                continuePlaying = false;
                System.out.println("Bye");
            }
        }
    }
}