package Words;

import java.util.Scanner;

public class CaesarCipher
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter text: ");
        String userInput = in.nextLine();
        System.out.println("Enter shift amount: ");
        int shiftAmount = Integer.parseInt(in.nextLine());
        // get character
        char letter = userInput.charAt(0);
        // System.out.println("Letter is " + shiftOneLetter(letter, shiftAmount));
        // System.out.println("Letter is " + shiftOneLetterV2(letter, shiftAmount));
        System.out.println("Letter is " + shiftOneLetterV3(letter, shiftAmount));
        // System.out.println("Word is " + caesarCipher(userInput, shiftAmount));
    }
    //   @param letter  inputted letter
    //   @param  shift  inputted shift amount
    //   @return currentChar    character at index of letter + shiftAmount
    public static char shiftOneLetter(char letter, int shift)
    {
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //convert char to int (find index)
        int charIndex = uppercaseLetters.indexOf(letter);
        // add shift amount
        charIndex += shift;
        // then convert new shifted amount to char
        char currentChar = uppercaseLetters.charAt(charIndex);
        // output encrypted text
        return currentChar;
    }
    //   @param letter  inputted letter
    //   @param  shift  inputted shift amount
    //   @return currentChar    character at index of letter + shiftAmount
    public static char shiftOneLetterV2(char letter, int shift)
    {
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //convert char to int (find index)
        int charIndex = uppercaseLetters.indexOf(letter);
        // add shift amount
        charIndex += shift;
        // check if number is negative or above 26
        if(charIndex < 0)
        {
            charIndex %= 26;
        }
        if(charIndex >= 26)
        {
            charIndex %= 26;
        }
        // then convert new shifted amount to char
        char currentChar = uppercaseLetters.charAt(charIndex);
        // output encrypted text
        return currentChar;
    }
    //   @param letter  inputted letter
    //   @param  shift  inputted shift amount
    //   @return currentChar    character at index of letter + shiftAmount
    public static char shiftOneLetterV3(char letter, int shift)
    {
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        //convert char to int (find index)
        int charIndex = uppercaseLetters.indexOf(letter);
        char currentChar;
        if(uppercaseLetters.charAt(charIndex) == -1)
        {
            // add shift amount
            charIndex += shift;
            if(charIndex < 0)
            {
                charIndex %= 26;
            }
            if(charIndex >= 26)
            {
                charIndex %= 26;
            }
            // then convert new shifted amount to char
            currentChar = lowercaseLetters.charAt(charIndex);
            // output encrypted text
        }
        else
        {
            // add shift amount
            charIndex += shift;
            if(charIndex < 0)
            {
                charIndex += 26;
            }
            if(charIndex >= 26)
            {
                charIndex -= 26;
            }
            // then convert new shifted amount to char
            currentChar = uppercaseLetters.charAt(charIndex);
            // output encrypted text
        }
        return currentChar;
    }
    //   @param str  inputted word or phrase
    //   @param  shiftAmount  inputted shift amount
    //   @return word    final shifted word or phrase
    public static String caesarCipher(String str, int shiftAmount)
    {
        // Get string, go character by character by using a loop
        // Save new shifted character into new string
        String word = "";
        for(int i = 0; i < str.length(); i++)
        {
            // get one character from string
            char letter = str.charAt(i);
            // if there are spaces
            if(letter != ' ')
            {
                // call shiftOneLetter to encode that char
                char letterShifted = shiftOneLetter(letter, shiftAmount);
                // save that new character into new string
                word += letterShifted;
            }
            else
            {
                word += ' ';
            }
        }
        return word;
    }
}