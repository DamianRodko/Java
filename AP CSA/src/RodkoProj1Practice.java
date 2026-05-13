public class RodkoProj1Practice
{
    public static void main(String []args)
    {
        //declaration
        String str = "Hello"; //The String being worked on
        char firstLetter = str.charAt(0); // The first letter
        char thirdLetter = str.charAt(2); //The 3rd letter
        String firstFour = str.substring(0, 4); //The first 4 characters
        String thirdEnd = str.substring(2, str.length()); //A String from the third letter to the end.
        int len = str.length(); //The length of the String.
        int indexOfA = str.indexOf("a"); //The position of the first occurrence of a
        char lastLetter = str.charAt(len - 1); //The last letter
        String lastThree = str.substring(str.length() - 3, str.length()); //The last 3 characters.
        //output
        System.out.println("The string being worked on is: " + str);
        System.out.println("The first letter is: " + firstLetter);
        System.out.println("The third letter is: " + thirdLetter);
        System.out.println("The first 4 chars are: " + firstFour);
        System.out.println("The string from the third letter on is : " + thirdEnd);
        System.out.println("The length of the String is " + len);
        System.out.println("The position is a: " + indexOfA);
        System.out.println("The last letter is " + lastLetter);
        System.out.println("The last 3 chars are: " + lastThree);
    }
}