package Words;
public class SchoolInformation 
{
    public static void main(String []args)
    {
        String name;
        String address;
        String city;
        String state;
        
        name  = "Forest Hills High School";
        address  = " is located at 67-01 110th Street";
        city = "Forest Hills";
        state = "NY";
        
        int zip;
        int students;
        
        zip = 11375;
        students = 3629;

        System.out.println(name + address + ", " + city + ", " + state +" " + zip);
        System.out.println("Current Enrollment: " + students + " students");
    }

}
