public class RodkoStringMethods
{
    public static void main(String []args)
    {
        // BeginToEnd
        String word = "Hello"; 
        char firstLetter = word.charAt(0);
        String result = word.substring(1, word.length());
        System.out.println(result + firstLetter);

        //EndToBegin
        char lastLetter = word.charAt(word.length() - 1);
        String result2 = word.substring(0, word.length() - 1);
        System.out.println(lastLetter + result2);

        //SwitchBeginToEnd
        String result3 = word.substring(1, word.length() - 1);
        System.out.println(lastLetter + result3 + firstLetter);

        //ExtraEnds
        String result4 = word.substring(word.length() - 2, word.length());
        System.out.println(result4 + result4 + result4);

        //MiddleTwo
        String firstHalf = word.substring(0, word.length() / 2);
        String secondHalf = word.substring(word.length() / 2);
        String firstEnd = firstHalf.substring(firstHalf.length() - 1);
        String secondEnd = secondHalf.substring(0, 1);
        System.out.println(firstEnd + secondEnd);
        
        //Right2
        String right = word.substring(word.length() - 2);
        String left = word.substring(0, word.length() - 2);
        System.out.println(right + left);

    }
    
}