import java.util.Scanner;
public class AskAboutSchoolInformation
{
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter school name: ");
        String name = in.nextLine();
        System.out.print("Enter school address: ");
        String address = in.nextLine();
        System.out.print("Enter school city: ");
        String city = in.nextLine();
        System.out.print("Enter school state: ");
        String state = in.nextLine();
        System.out.print("Enter school zip code: ");
        int zip = in.nextInt();
        System.out.print("Enter school enrollment: ");
        int students = in.nextInt();

        System.out.println(name + " is located at " + address + ", " + city + ", " + state + " " + zip);
        System.out.println("Current Enrollment: " + students + " students");
    }

}


    


