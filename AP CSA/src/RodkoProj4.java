
import javax.swing.JOptionPane;

public class RodkoProj4
{
    public static void main(String[] args)
    {
        System.out.println("1:");
        System.out.println(iCJava("javaxyzjava")); // true
        System.out.println(iCJava("javaxyzjav")); // false
        System.out.println(iCJava("xyzjavajava")); // true
        System.out.println(iCJava("javaxjxavaxyzjavajava")); // false
        System.out.println(iCJava("none here")); // false
        System.out.println("2:");
        System.out.println(differentNeighbors("forest")); // true
        System.out.println(differentNeighbors("alabama")); // true
        System.out.println(differentNeighbors("baamno")); // false
        System.out.println(differentNeighbors("banana")); // true
        System.out.println(differentNeighbors("baboon")); // false
        System.out.println("3a:");
        System.out.println(reverse("abcd"));
        System.out.println(reverse("hello"));
        System.out.println("3b:");
        System.out.println(mirrorM("abcMdefghi"));
        System.out.println(mirrorM("hijklMnop"));
        System.out.println(mirrorM("xyMabc"));
        System.out.println(mirrorM("blahMboom"));
        System.out.println("4:");
        System.out.println(mockMeme("Don’t be a hero!"));
        System.out.println(mockMeme("Gravitational Acceleration!!"));
        System.out.println(mockMeme("yo, that was phat!!"));
        System.out.println(mockMeme("!a,b,c d e,!f"));
        System.out.println("5a:");
        System.out.println(getHint("HAPPY", "AAAAA"));
        System.out.println(getHint("HAPPY", "HELLO"));
        System.out.println(getHint("HAPPY", "HEART"));
        System.out.println(getHint("HAPPY", "HARPS"));
        System.out.println(getHint("HAPPY", "HAPPY"));
        System.out.println("5b:");
        playGuessingGame("HAPPY");
        System.out.println("6:");
        System.out.println(theEvilestE("HELLO"));
        System.out.println(theEvilestE("EXCESSIVELY"));
        System.out.println(theEvilestE("AEBCeEeDEFGH"));
        System.out.println(theEvilestE("AEBCEEeDEFGH"));
        System.out.println(theEvilestE("EnfeEeblEment"));
        System.out.println(theEvilestE("YipeEEEeEeEeeeeEeeeeeeeeE"));
        System.out.println(theEvilestE("xeEex"));
    }
    public static boolean iCJava(String str) 
    {
        int countJava = 0;
        for(int i = 0; i < str.length() - 3;i++)
        {
            if(str.substring(i, i + 4).equals("java"))
            {
                countJava++;
            }
        }
        if(countJava == 0)
        {
            return false;
        }
        else if(countJava%2 == 0)
        {
            return true;
        }
        else return false;
    }
    public static boolean differentNeighbors(String str)
    {
        for(int i = 0; i < str.length() - 1; i++)
        {
            if(str.charAt(i) == str.charAt(i + 1))
            {
                return false;
            }
        }
        return true;
    }
    public static String reverse(String str)
    {
        int len = str.length();
        String reverse = "";
        for(int i = 0; i < len; i++)
        {
            reverse += str.charAt(len - 1 -     i);
        }
        return reverse;
    }
    public static String mirrorM(String str)
    {
        int len = str.length();
        int posM = str.indexOf('M');
        String b4M = str.substring(0, posM);
        String afterM = str.substring(posM, len);
        if(b4M.length() < afterM.length())
        {
            String afterMLen = str.substring(posM , posM + b4M.length() + 1);
            String last = str.substring(posM + b4M.length() + 1, str.length());
            String afterMLenR = reverse(afterMLen);
            String b4MR = reverse(b4M);
            return afterMLenR + b4MR + last;
        }
        else if(b4M.length() > afterM.length())
        {
            String b4MLen = str.substring(posM - afterM.length() + 1, posM);
            String first = str.substring(0, posM - afterM.length());
            String b4MLenR = reverse(b4MLen);
            String afterMR = reverse(afterM);
            return first + afterMR + b4MLenR;
        }
        else return str;
    }
    public static String mockMeme(String phrase)
    {
        String str = "";
        for(int i = 0; i < phrase.length(); i++)
        {
            if(Character.isLetter(phrase.charAt(i)) || phrase.charAt(i) == ' ')
            {
                if(i % 2 == 0)
                {
                    str += Character.toUpperCase(phrase.charAt(i));
                }
                else
                {
                    str += Character.toLowerCase(phrase.charAt(i));
                }
            }
        }
        return str;
    }
    public static String getHint(String hiddenWord, String guess)
    {
        String str = "";
        boolean[] isInWord = new boolean[hiddenWord.length()];
        for(int k = 0; k < guess.length(); k++)
        {
            for(int i = 0; i < hiddenWord.length(); i++)
            {
                if(hiddenWord.charAt(i) == guess.charAt(k))
                {
                    isInWord[k] = true;
                }
            }
        }
        for(int j = 0; j < hiddenWord.length(); j++)
        {
            if(hiddenWord.charAt(j) == guess.charAt(j))
            {
                str += hiddenWord.charAt(j);
            }
            else if (isInWord[j])
            {
                str += "+";
            }
            else
            {
                str += "*";
            }
        }
        return str;
    }
    public static void playGuessingGame(String hiddenWord)
    {
        boolean isWon = false;
        int i = 10;
        while(i > 0 && !isWon)
        {
            String guess = JOptionPane.showInputDialog("Enter your guess: ");
            JOptionPane.showMessageDialog(null, getHint(hiddenWord, guess));
            i--;
            JOptionPane.showMessageDialog(null, "You have " + i + " more tries!");
            if(guess.equals(hiddenWord))
            {
                isWon = true;
                JOptionPane.showMessageDialog(null, "You won!");
            }
        }
    }
    public static String theEvilestE(String str)
    {
        int count = 0;
        int eIndex = 0;
        String out = "";
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == 'E')
            {
                count++;
            }
        }
        if(count%2 == 0)
        {
            return str;
        }
        int posMidE = (count / 2) + 1;
        int eCount = 0;
        for(int j = 0; j < str.length(); j++)
        {
            if(str.charAt(j) == 'E')
            {
                eCount++;
                if(eCount == posMidE)
                {    
                    eIndex = j;
                }
            }
        }
        if(str.charAt(eIndex - 1) == 'e' && str.charAt(eIndex + 1) == 'e')
        {
            for(int k = 0; k < str.length(); k++)
            {
                if(k != eIndex)
                {
                    out += "-";
                }
                else out += "E";
            }
        }
        else return str;
        return out;
    }
}
