package Math;
import java.util.Scanner;
public class CurrencyConverter
{
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        boolean continuePlaying = true;
        while (continuePlaying)
        {
            System.out.println("Choose the options of conversion:" + "\n" + "A. USD to EUR" + "\n" + "B. EUR to USD" + "\n" + "C. USD to JPY" + "\n" + "D. JPY to USD");
            String choice = in.nextLine().toUpperCase();
            if (choice.equals("A"))
            {
                System.out.print("Enter USD: ");
                double USD = in.nextDouble();
                System.out.println(USDToEUR(USD));
            }       
                else if(choice.equals("B"))
            {
                System.out.print("Enter EUR: ");
                double EUR = in.nextDouble();
                System.out.println(EURToUSD(EUR));
            }
                else if(choice.equals("C"))
            {
                System.out.print("Enter USD: ");
                double USD = in.nextDouble();
                System.out.println(USDToJPY(USD));
            }
                else
            {
                System.out.print("Enter JPY: ");
                double JPY = in.nextDouble();
                System.out.println(JPYToUSD(JPY));
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
                System.out.println("Bye!");
            }
        }//end continuePlaying
    }//end main
    /*
     *USDToEUR
     *@param USD  inputted currency
     *@return EUR calculated currency
    */
    public static double USDToEUR(double USD)
    {
        double EUR = USD * 0.94;
        System.out.print("EUR = ");
        return Math.round(EUR * 100)/100.0;
    }
    /*
    /*
     *EURToUSD
     *@param EUR  inputted currency
     *@return USD calculated currency
    */
    public static double EURToUSD(double EUR)
    {
        double USD = EUR * 1.06;
        System.out.print("USD = ");
        return Math.round(USD * 100)/100.0;
    }
    /*
     *USDToJPY
     *@param USD  inputted currency
     *@return JPY calculated currency
    */
    public static double USDToJPY(double USD)
    {
        double JPY = USD * 149;
        System.out.print("JPY = ");
        return Math.round(JPY * 100)/100.0;
    }
    /*
    /*
     *JPYToUSD
     *@param JPY  inputted currency
     *@return USD calculated currency
    */
    public static double JPYToUSD(double JPY)
    {
        double USD = JPY * 0.0067;
        System.out.print("USD = ");
        return Math.round(USD * 100)/100.0;
    }
}