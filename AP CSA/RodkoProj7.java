import cardgames.*;
import javax.swing.JOptionPane;
public class RodkoProj7
{
    public static GUI gui = new GUI(2, true); //4 is the number of cards shown
    public static Deck deck = new Deck();//creates a new deck
    public static int currentAmount = 1000; //starting amount is 1000
    public static void main(String[] args)
    {
        boolean continuePlaying = true;
        //repeat program loop
        while(continuePlaying)
        {
            deck.shuffleDeck();//shuffles the deck
            gui.showAmount(currentAmount);//shows 10000 as starting $ amount
            Card c1 = deck.dealCard();//takes card from top of deck and assigns it to a card object
            Card c2 = deck.dealCard();
            gui.showCard(c1);//displays the card on the gui
            gui.showCard(c2);
            String guess = JOptionPane.showInputDialog("Bet that the next card comes Before(0) Between(1) or After(2) the two displayed cards.");
            while(!guess.equals("0") && !guess.equals("1") && !guess.equals("2"))//checks if number inputted is valid
            {
                guess = JOptionPane.showInputDialog("Please enter 0, 1, or 2 only.");
            }
            int choice = Integer.parseInt(guess);//saves choice as an int
            double betAmount;
            boolean isValid = false;
            while(true)
            {
                String bet = JOptionPane.showInputDialog("Enter bet amount:");
                if(!isValidInteger(bet))//checks if number is valid
                {
                    gui.showMessage("Invalid number");
                    continue;
                }
                betAmount = Double.parseDouble(bet);
                if(!isValidBet(betAmount))//checks if number exceeds bank range
                {
                    gui.showMessage("Insufficient funds");
                    continue;
                }
                break;
            }
            gui.showBet(betAmount);
            Card topCard = deck.dealCard();//deals a new top card
            gui.showDeckCard(topCard);//shows top card
            boolean isWon = false;
            if(choice == 0)
            {
                if(topCard.getValue() < c1.getValue() && topCard.getValue() < c2.getValue())//checks if topcard is before
                {
                    isWon = true;
                }
            }
            if(choice == 1)
            {
                if(topCard.betweenCards(c1, c2))//checks if topcard is between
                {
                    isWon = true;
                }
            }
            if(choice == 2)
            {
                if(topCard.getValue() > c1.getValue() && topCard.getValue() > c2.getValue())//checks if topcard is after
                {
                    isWon = true;
                }
            }
            if(isWon)
            {
                currentAmount += betAmount * 2;//doubles money bet and adds it to bank
                gui.showMessage("You won!");
            }
            else
            {
                currentAmount -= betAmount;//loses the money bet
                gui.showMessage("You lost!");
            }
            gui.showAmount(currentAmount);
            
            if(currentAmount == 0)//ends game if the user has no more money 
            {
                continuePlaying = false;
                gui.showMessage("Game over");
                break;
            }
            String keepPlaying = JOptionPane.showInputDialog("Do you want to keep playing?Y/N").toUpperCase();//asks the user if they want to play again
            while(!keepPlaying.equals("Y") && !keepPlaying.equals("N"))
            {
                keepPlaying = JOptionPane.showInputDialog("Please enter a valid option: Y/N").toUpperCase();//checks if number string is valid
            }
            
            if(keepPlaying.equals("Y"))
            {
                continuePlaying = true;
                betAmount = 0;
                gui.showBet(betAmount);
                gui.clearDeckCard();
                gui.clearPlayerCards();
                gui.showMessage("");
            }
            else
            {
                gui.showMessage("Game over");
                continuePlaying = false;
            }
        }
    }
    public static boolean isValidBet(double bet)//checks if bet exceeds bank range
    {
        return bet > 0 && bet <= currentAmount;
    }
    public static boolean isValidInteger(String input)//checks if inputted string is a valid digit
    {
        if(input.equals(""))
        {
            return false;
        }
        for(int i = 0; i < input.length(); i++)
        {
            if (!Character.isDigit(input.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
}