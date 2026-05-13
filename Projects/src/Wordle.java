package Games;
import java.util.Scanner;
public class Wordle
{
    public static String RED = "\u001B[41m ";
    public static String GREEN = "\u001B[42m ";
    public static String YELLOW = "\u001B[43m ";
    public static String CLEAR = "\u001B[0m";
    public static String CORRECT = GREEN + GREEN +GREEN + GREEN + GREEN + CLEAR;
    public static void main(String []args)
    {
        System.out.println("Welcome to Damian Rodko's Wordle game!");
        System.out.println("The word is 5 letters long.");
        System.out.println(RED + CLEAR + " = the letter does not exist in the word.");
        System.out.println(GREEN + CLEAR + " = correct letter in the correct spot.");
        System.out.println(YELLOW + CLEAR + " = correct letter but in the wrong spot.");
        boolean continuePlaying = true;
        //repeat program loop
        while(continuePlaying)
        {
            Scanner in = new Scanner(System.in);
            String word = "";
            int num = (int) (Math.random() * 20 + 1);
            if(num == 1)
            {
                word = "SHIFT";
            }
            else if(num == 2)
            {
                word = "PHONE";
            }
            else if(num == 3)
            {
                word = "TIRED";
            }
            else if(num == 4)
            {
                word = "EQUAL";
            }
            else if(num == 5)
            {
                word = "LINKS";
            }
            else if(num == 6)
            {
                word = "SMALL";
            }
            else if(num == 7)
            {
                word = "LAUGH";
            }
            else if(num == 8)
            {
                word = "STYLE";
            }
            else if(num == 9)
            {
                word = "VIDEO";
            }
            else if(num == 10)
            {
                word = "WHERE";
            }
            else if(num == 11)
            {
                word = "MAGIC";
            }
            else if(num == 12)
            {
                word = "TRIAL";
            }
            else if(num == 13)
            {
                word = "SIXTY";
            }
            else if(num == 14)
            {
                word = "FLASH";
            }
            else if(num == 15)
            {
                word = "DRAMA";
            }
            else if(num == 16)
            {
                word = "PILOT";
            }
            else if(num == 17)
            {
                word = "DRILL";
            }
            else if(num == 18)
            {
                word = "BLAME";
            }
            else if(num == 19)
            {
                word = "ROUND";
            }
            else if(num == 20)
            {
                word = "FLOOR";
            }
            String output = "";
            System.out.println("Try guessing the word: ");
            //repeat if guess is wrong
            while (!output.equals(CORRECT))
            {
                output = "";
                String word1 = in.nextLine().toUpperCase();
                while(word1.length() != 5)
                {
                    System.out.println("Please enter a 5 letter word.");
                    word1 = in.nextLine().toUpperCase();
                }
                String letter1Word1 = word1.substring(0, 1);
                String letter2Word1 = word1.substring(1, 2);
                String letter3Word1 = word1.substring(2, 3);
                String letter4Word1 = word1.substring(3, 4);
                String letter5Word1 = word1.substring(4, 5);
                String letter1Word = word.substring(0, 1);
                String letter2Word = word.substring(1, 2);
                String letter3Word = word.substring(2, 3);
                String letter4Word = word.substring(3, 4);
                String letter5Word = word.substring(4, 5);
                int letter1Idx = 0;
                int letter2Idx = 1;
                int letter3Idx = 2;
                int letter4Idx = 3;
                int letter5Idx = 4;
                if(letter1Word1.equals(letter1Word))
                {
                    output += GREEN;
                }
                //check letter 1
                else if(word.contains(letter1Word1))
                {
                    int letter1WordCount = word.length() - word.replace(letter1Word1, "").length();
                    int idx = 0;
                    while (idx < 5)
                    {
                        int idxWord = word.indexOf(letter1Word1, idx);
                        int idxWord1 = word1.indexOf(letter1Word1, idx);
                        if ((idxWord == idxWord1 && idxWord == idx) || (idx < letter1Idx && idxWord1 == idx)) {
                        letter1WordCount --;
                    }
                    idx += 1;
                    }
                    if (letter1WordCount > 0)
                    {
                        output += YELLOW;
                    }
                    else 
                    {
                       output += RED;
                    }
                }//end letter 1
                else
                {
                    output += RED;
                }
                //check letter 2
                if(letter2Word1.equals(letter2Word))
                {
                    output += GREEN;
                }
                else if(word.contains(letter2Word1))
                {
                    int letter2WordCount = word.length() - word.replace(letter2Word1, "").length();
                    int idx = 0;
                    while (idx < 5)
                    {
                        int idxWord = word.indexOf(letter2Word1, idx);
                        int idxWord1 = word1.indexOf(letter2Word1, idx);
                        if ((idxWord == idxWord1 && idxWord == idx) || (idx < letter2Idx && idxWord1 == idx))
                        {
                            letter2WordCount --;
                        }
                        idx += 1;
                    }
                    if (letter2WordCount > 0)
                    {
                        output += YELLOW;
                    }
                    else
                    {
                        output += RED;
                    }
                }//end letter 2
                else
                {
                    output += RED;
                }
                //check letter 3
                if(letter3Word1.equals(letter3Word))
                {
                    output += GREEN;
                }
                else if(word.contains(letter3Word1))
                {
                    int letter3WordCount = word.length() - word.replace(letter3Word1, "").length();
                    int idx = 0;
                    while (idx < 5)
                    {
                        int idxWord = word.indexOf(letter3Word1, idx);
                        int idxWord1 = word1.indexOf(letter3Word1, idx);
                        if ((idxWord == idxWord1 && idxWord == idx) || (idx < letter3Idx && idxWord1 == idx))
                        {
                            letter3WordCount --;
                        }
                        idx += 1;
                    }
                    if (letter3WordCount > 0)
                    {
                        output += YELLOW;
                    }
                    else
                    {
                        output += RED;
                    }
                }//end letter 3
                else
                {
                    output += RED;
                }
                if(letter4Word1.equals(letter4Word))
                {
                    output += GREEN;
                }
                //check letter 4
                else if(word.contains(letter4Word1))
                {
                    int letter4WordCount = word.length() - word.replace(letter4Word1, "").length();
                    int idx = 0;
                    while (idx < 5)
                    {
                        int idxWord = word.indexOf(letter4Word1, idx);
                        int idxWord1 = word1.indexOf(letter4Word1, idx);
                        if ((idxWord == idxWord1 && idxWord == idx) || (idx < letter4Idx && idxWord1 == idx))
                        {
                            letter4WordCount --;
                        }
                        idx += 1;
                    }
                    if (letter4WordCount > 0)
                    {
                        output += YELLOW;
                    }
                    else
                    {
                        output += RED;
                    }
                }//end letter 4
                else
                {
                    output += RED;
                }
                //check letter 5
                if(letter5Word1.equals(letter5Word))
                {
                    output += GREEN;
                }
                else if(word.contains(letter5Word1))
                {
                    int letter5WordCount = word.length() - word.replace(letter5Word1, "").length();
                    int idx = 0;
                    while (idx < 5)
                    {
                        int idxWord = word.indexOf(letter5Word1, idx);
                        int idxWord1 = word1.indexOf(letter5Word1, idx);
                        if ((idxWord == idxWord1 && idxWord == idx) || (idx < letter5Idx && idxWord1 == idx))
                        {
                            letter5WordCount --;
                        }
                        idx += 1;
                    }
                    if (letter5WordCount > 0)
                    {
                        output += YELLOW;
                    }
                    else
                    {
                        output += RED;
                    }
                }// end letter 5
                else
                {
                    output += RED;
                }
                output += CLEAR;
                System.out.println(output);
                if (!output.equals(CORRECT))
                {
                    System.out.println("Please try again");
                }
            }//end wrong answer loop
            System.out.println("Congrats you got it right!");
            System.out.println("Do you want to keep playing?Y/N");
            String choice = in.nextLine().toUpperCase();
            while(choice.length() != 1)
            {
                System.out.println("Please enter a valid option: ");
                choice = in.nextLine().toUpperCase();
            }
            if(choice.equals("Y"))
            {
                continuePlaying = true;
            }
            else
            {
                System.out.println("Bye!");
                continuePlaying = false;
            }
        }//end continue playing loop
    }//end public static
}//end class