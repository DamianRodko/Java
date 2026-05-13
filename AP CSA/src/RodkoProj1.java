import javax.swing.JOptionPane;
public class RodkoProj1
{
    /**
    * Title: Project 1 Part 2
    *
    * Description: Introduction to Writing Programs using the String methods 
    *
    * @author Damian Rodko
    */

    public static void main(String []args)
    {
        /*
        Possible websites:
        ftp://www.pcwebopedia.com/stuff.exe
        http://www.pcwebopedia.com/index.html
        http://www.foresthillshs.org/apps/index.html
        declaration statements
        */
        String url;
        int positionOfColon;
        String protocol;
        String restOfURL;
        String domainName;
        String fileName;
        int positionOfSlash;
        int fileNameLength;
        char firstLetter;
        char lastLetter;
        //prompt the user for a URL
        url = JOptionPane.showInputDialog("Please enter a URL");
        System.out.println("The url is : " + url);
        //extract and print protocol
        positionOfColon = url.indexOf(":");
        System.out.println("Position of colon: " + (positionOfColon + 1));
        protocol = url.substring(0, positionOfColon);
        System.out.println("Protocol: " + protocol);
        //extract and print the domain name
        restOfURL = url.substring(positionOfColon + 7, url.length());
        System.out.println("The rest of the url is: " + restOfURL);
        positionOfSlash = restOfURL.indexOf("/");
        System.out.println("The position of the slash is: " + (positionOfSlash + 1));
        domainName = restOfURL.substring(0, positionOfSlash);
        System.out.println("The domain name is: " + domainName);
        //extract and print the filename
        fileName = restOfURL.substring((positionOfSlash + 1), restOfURL.length());
        System.out.println("The file name is: " + fileName);
        //determine and print the number of characters in the filename
        fileNameLength = fileName.length();
        System.out.println("The file name length is: " + fileNameLength);
        //determine and print the first and last character of the filename
        firstLetter = fileName.charAt(0);
        System.out.println("The first letter is: " + firstLetter);
        lastLetter = fileName.charAt(fileNameLength - 1);
        System.out.println("The last letter is: " + lastLetter);
        
        System.out.println("==============================================================");
        
        //declaration statements
        String date = "May 28, 2009";
        int positionOfSpace;
        String month;
        int positionOfComma;
        String day;
        int len;
        String year;
        //print the date
        System.out.println("The date is " + date);
        //extract and print the month
        positionOfSpace = date.indexOf(" ");
        month = date.substring(0, positionOfSpace);
        System.out.println("The month is " + month);
        //extract and print day
        positionOfComma = date.indexOf(",");
        day = date.substring(positionOfSpace, positionOfComma);
        System.out.println("The day is " + day);
        //extract and print year
        len = date.length();
        year = date.substring((positionOfComma + 2), len);
        System.out.println("The year is " + year);
        
    }
}
