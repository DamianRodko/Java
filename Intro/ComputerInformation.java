package Words;
public class ComputerInformation 
{
    public static void main(String []args)
    {
        String os;
        String diskType;
        String graphics;
        
        os  = "Windows 11";
        diskType  = "SSD";
        graphics = "Nvidia RTX";
        
        int ram;
        int disk;
        
        ram = 64;
        disk = 1;

        System.out.print("My computer runs " + os);
        System.out.print(", has "+ ram + "GB of ram, a ");
        System.out.print(disk + "TB " + diskType + " drive, with a ");
        System.out.print(graphics + " graphics card.");
    }

}