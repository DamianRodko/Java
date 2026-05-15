import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Connect4
{
    public static String R = "\u001B[41m ";
    public static String B = "\u001B[44m ";
    public static String C = "\u001B[0m";
    public static void main(String[] args)
    {
        System.out.println("Welcome to Damian Rodko's Connect 4 game!");
        Scanner in = new Scanner(System.in); 
        // main game loop
        boolean continuePlaying = true;
        while(continuePlaying)
        {
            // menu
            System.out.println("Menu");
            System.out.println("1. Local game");
            System.out.println("2. Play against computer");
            System.out.println("3. Exit");
            System.out.print("Choose your option: ");
            int option = in.nextInt();
            // check if option is valid
            while(option < 1 || option > 3)
            {
                System.out.println("Please enter a valid number.");
                option = in.nextInt();
            }
            // check option
            // local game
            if(option == 1)
            {
                // connect 4 board
                String[][] board = {{"O","O","O","O","O","O","O"},
                                    {"O","O","O","O","O","O","O"},
                                    {"O","O","O","O","O","O","O"},
                                    {"O","O","O","O","O","O","O"},
                                    {"O","O","O","O","O","O","O"},
                                    {"O","O","O","O","O","O","O"}, };
                // print array
                printArray(board);
                // 1v1 against person
                playLocal(board);
            }
            // against computer
            else if(option == 2)
            {
                // connect 4 board
                String[][] board = {{"O","O","O","O","O","O","O"},
                                    {"O","O","O","O","O","O","O"},
                                    {"O","O","O","O","O","O","O"},
                                    {"O","O","O","O","O","O","O"},
                                    {"O","O","O","O","O","O","O"},
                                    {"O","O","O","O","O","O","O"}, };
                // print array
                printArray(board);
                // play against computer
                playComputer(board);
            }
            // exit
            else if(option == 3)
            {
                System.out.println("Goodbye!");
                continuePlaying = false;
            }
        }//end while
    }// end main
    // @param array  any 2D integer array
    // takes array and prints it
    public static void printArray(String[][] array)
    {
        for(int row = 0; row < array.length; row++) // each row
        {
            //print out each column
            for(int col = 0; col < array[row].length;col++)
            {
                System.out.print(array[row][col]);
            }
            System.out.println();
        }
    }//end printArray
    // @param array any 2D integer array
    // asks user to input which column they would go into
    // uses the user input and drops a checker into that specified column
    public static void playLocal(String[][] board)
    {
        Scanner in = new Scanner(System.in);
        String winner = "O";
        System.out.println("Player 1:" + R + C);
        System.out.println("Player 2: " + B + C);
        System.out.println("Pick a number 1-7 to pick which column to go in.");
        // start game loop
        for(int i = 1; i <= 21; i++)
        {
            // player 1
            //ask user
            System.out.print("Player 1 go: ");
            // inputted column
            int column = in.nextInt() - 1;
            // check if column is valid
            while(column < 0 || column >= 7 || !board[0][column].equals("O"))
            {
                System.out.print("Please enter a valid column # (1-7): ");
                column = in.nextInt() - 1;
            }
            // loop through row and column to check if spot is available
            for (int row = board.length - 1; row >= 0; row--)
            {
                if (board[row][column].equals("O"))
                {
                    // change specified row and column to red
                    board[row][column] = R + C;
                    break;
                }
            }
            // print array
            printArray(board);
            // check winner
            winner = checkWinner(board);
            if(!winner.equals("O"))
            {
                if(winner.equals(R + C))
                {
                    System.out.println("The winner is: Player 1");
                }
                else
                {
                    System.out.println("The winner is: Player 2");
                }
                break;
            }
            //player 2
            //ask user
            System.out.print("Player 2 go: ");
            //change column to newly inputted column
            column = in.nextInt() - 1;
            // check if column is valid
            while(column < 0 || column >= 7 || !board[0][column].equals("O"))
            {
                System.out.print("Please enter a valid column # (1-7): ");
                column = in.nextInt() - 1;
            }
            //if column is the same as the previous column, go up 1 row
            for (int row = board.length - 1; row >= 0; row--)
            {
                if (board[row][column].equals("O"))
                {
                    // change specified row and column to red
                    board[row][column] = B + C;
                    break;
                }
            }
            //print array
            printArray(board);
            // check winner
            winner = checkWinner(board);
            if(!winner.equals("O"))
            {
                if(winner.equals(R + C))
                {
                    System.out.println("The winner is: Player 1");
                }
                else
                {
                    System.out.println("The winner is: Player 2");
                }
                break;
            }
        }//end for game loop
        if (winner.equals("O"))
        {
            System.out.println("Game tied");
        }
    }//end playLocal
    // @param array any 2D integer array
    // asks user to input which column they would go into
    // uses the user input and drops a checker into that specified column
    // uses random method to randomly generate a column to go into
    public static void playComputer(String[][] board)
    {
        Scanner in = new Scanner(System.in);
        String winner = "O";
        System.out.println("Player 1:" + R + C);
        System.out.println("Computer : " + B + C);
        System.out.println("Pick a number 1-7 to pick which column to go in.");
        // start game loop
        for(int i = 1; i <= 21; i++)
        {
            // player 1
            //ask user
            System.out.print("Player 1 go: ");
            // inputted column
            int column = in.nextInt() - 1;
            // check if column is valid
            while(column < 0 || column >= 7 || !board[0][column].equals("O"))
            {
                System.out.print("Please enter a valid column # (1-7): ");
                column = in.nextInt() - 1;
            }
            // loop through row and column to check if spot is available
            for (int row = board.length - 1; row >= 0; row--)
            {
                if (board[row][column].equals("O"))
                {
                    // change specified row and column to red
                    board[row][column] = R + C;
                    break;
                }
            }
            // print array
            printArray(board);
            // check winner
            winner = checkWinner(board);
            // if there is a winner, end game
            if(!winner.equals("O"))
            {
                if(winner.equals(R + C))
                {
                    System.out.println("The winner is: Player 1");
                }
                else
                {
                    System.out.println("The winner is: Player 2");
                }
                break;
            }
            // computer
            System.out.println("Computer's turn");
            //change column to newly inputted column
            column = (int) (Math.random() * 7) + 1;
            // check if column is valid
            while(!board[0][column - 1 ].equals("O"))
            {
                column = (int) (Math.random() * 7) + 1;
            }
            System.out.println("Computer is thinking...");
            try
            {
                TimeUnit.SECONDS.sleep(1);
            }
            catch(InterruptedException e)
            {
            }
            System.out.println("Computer chose column: " + column);
            //if column is the same as the previous column, go up 1 row
            for (int row = board.length - 1; row >= 0; row--)
            {
                if (board[row][column - 1].equals("O"))
                {
                    // change specified row and column to red
                    board[row][column - 1] = B + C;
                    break;
                }
            }
            //print array
            printArray(board);
            // check winner
            winner = checkWinner(board);
            // if there is a winner, end game
            if(!winner.equals("O"))
            {
                if(winner.equals(R + C))
                {
                    System.out.println("The winner is: Player 1");
                }
                else
                {
                    System.out.println("The winner is: Player 2");
                }
                break;
            }
        }// end main for loop
        if (winner.equals("O"))
        {
            System.out.println("Game tied");
        }
    }// end playComputer
    // @param array any 2D integer array
    // @return slot  return the color that won
    // takes a 2D array and checks if 4 adjacent slots have the same player color
    // checks for vertical, horizontal, diagonal up, and diagonal down winner
    public static String checkWinner(String[][] board)
    {
        // check for vertical winner
        for(int row = 0; row<board.length - 3; row++)
        {
            for(int col = 0;col<board[0].length;col++)
            {
                String slot = board[row][col];
                if (slot.equals("O"))
                {
                    continue;
                }
                if (board[row+1][col].equals(slot) && board[row+2][col].equals(slot) && board[row+3][col].equals(slot))
                {
                    return slot;
                }
            }
        }// end vertical winner
        // check for horizontal winner
        for(int row = 0; row<board.length; row++)
        {
            for(int col = 0;col<board[0].length - 3;col++)
            {
                String slot = board[row][col];
                if (slot.equals("O"))
                {
                    continue;
                }
                if (board[row][col+1].equals(slot)&& board[row][col+2].equals(slot) && board[row][col+3].equals(slot))
                {
                    return slot;
                }
            }
        }// end horizontal winner
        // for diagonal down winner
        for(int row = 0; row<board.length - 3; row++)
        {
            for(int col = 0;col<board[0].length - 3;col++)
            {
                String slot = board[row][col];
                if (slot.equals("O"))
                {
                    continue;
                }
                if (board[row+1][col+1].equals(slot) && board[row+2][col+2].equals(slot) && board[row+3][col+3].equals(slot))
                {
                    return slot;
                }
            }
        }// end diagonal down winner
        // check for diagonal up winner.
        for(int row = 3; row<board.length; row++)
        {
            for(int col = 0;col<board[0].length - 3;col++)
            {
                String slot = board[row][col];
                if (slot.equals("O"))
                {
                    continue;
                }
                if (board[row-1][col+1].equals(slot) && board[row-2][col+2].equals(slot) && board[row-3][col+3].equals(slot))
                {
                    return slot;
                }
            }
        }//end diagonal up winner
        // if none, return O
        return "O";
    }//end checkWinner
}//end class 