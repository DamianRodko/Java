import java.util.Scanner;
public class TemperatureConverter
{
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        boolean continuePlaying = true;
        while (continuePlaying)
        {
            System.out.println("Choose the options of conversion:" + "\n" + "A. Fahrenheit to Celsius" + "\n" + "B. Celsius to Fahrenheit" + "\n" + "C. Fahrenheit to Kelvin" + "\n" + "D. Kelvin to Fahrenheit" + "\n" + "E. Kelvin to Celsius" + "\n" + "F. Celsius to Kelvin");
            String choice = in.nextLine().toUpperCase();
            if (choice.equals("A"))
            {
                System.out.print("Enter Fahrenheit: ");
                double F = in.nextDouble();
                System.out.println(FToC(F));
            }       
            else if(choice.equals("B"))
            {
                System.out.print("Enter Celsius: ");
                double C = in.nextDouble();
                System.out.println(CToF(C));
                
            }
            else if(choice.equals("C"))
            {
                System.out.print("Enter Fahrenheit: ");
                double F = in.nextDouble();
                System.out.println(FToK(F));
            }
            else if(choice.equals("D"))
            {
                System.out.print("Enter Kelvin: ");
                double K = in.nextDouble();
                System.out.println(KToC(K));
            }
            else
            {
                System.out.print("Enter Celsius: ");
                double C = in.nextDouble();
                System.out.println(CToK(C));
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
        }
    }//end main
    
    /*
     *
     *FToC
     *@param            F  inputted temperature fahrenheit
     *@return           C calculated celsius
    */
    public static double FToC(double F)
    {
        double C = (F - 32) / 1.8;
        System.out.print("°C = ");
        return C;
    }
    /*
     *
     *CToF
     *@param            C  inputted temperature celsius
     *@return           F calculated fahrenheit
    */
    public static double CToF(double C)
    {
        double F = (C - 32) / 1.8;
        System.out.print("°F = ");
        return F;
    }
    /*
     *
     *FtToK
     *@param            F  inputted temperature fahrenheit
     *@return           K calculated kelvin
    */
    public static double FToK(double F)
    {
        double K = (((F - 32) * 5) / 9) + 273.15;
        System.out.print("°K = ");
        return K;
    }
    /*
     *
     *KToF
     *@param            K  inputted temperature kelvin
     *@return           F calculated fahrenheit
    */
    public static double KToF(double K)
    {
        double F = ((K - 273.15) * 1.8) + 32;
        System.out.print("°F = ");
        return F;
    }
    /*
     *
     *KToC
     *@param            K  inputted temperature kelvin
     *@return           C calculated celsius
    */
    public static double KToC(double K)
    {
        double C = K + 273.15;
        System.out.print("°C = ");
        return C;
    }
    /*
     *
     *CToK
     *@param            C  inputted temperature celsius
     *@return           K calculated kelvin
    */
    public static double CToK(double C)
    {
        double K = C -273.15;
        System.out.print("°K = ");
        return K;
    }
}