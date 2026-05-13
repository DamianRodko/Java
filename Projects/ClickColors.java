package games;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.TextField;
public class ClickColors
{
   private static int score = 0;
   public static void main(String[] args)
    {
        //create text
        TextField text = new TextField();
        text.setBounds(100, 350, 150, 20);
        //create window
        JFrame window = new JFrame("Damian's Super Awesome Window");
        window.setSize(700, 800);
        window.setLayout(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // blue button
        JButton blue = new JButton("BLUE");
        blue.setBounds(100, 100, 150, 50);
        blue.setBackground(Color.BLUE);
        window.add(blue);
        // red button
        JButton red = new JButton("RED");
        red.setBounds(100, 200, 150, 50);
        red.setBackground(Color.RED);
        // green button
        JButton green = new JButton("GREEN");
        green.setBounds(300, 100, 150, 50);
        green.setBackground(Color.GREEN);
        // yellow button
        JButton yellow = new JButton("YELLOW");
        yellow.setBounds(300, 200, 150, 50);
        yellow.setBackground(Color.YELLOW);
        // purple button
        JButton purple = new JButton("PURPLE");
        purple.setBounds(200, 150, 150, 50);
        purple.setBackground(Color.MAGENTA);
        //exit button
        JButton exit = new JButton("EXIT");
        exit.setBounds(500, 150, 150, 50);
        //blue button clicked
        blue.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                window.add(red);
                red.repaint();
                score++;
            }
        });
        //red button clicked
        red.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                window.add(green);
                green.repaint();
                score++;
            }
        });
        //green button clicked
        green.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                window.add(yellow);
                yellow.repaint();
                score++;
            }
        });
        //yellow button clicked
        yellow.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                window.add(purple);
                purple.repaint();
                score++;
            }
        });
        //purple button clicked
        purple.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                score++;
                text.setText("Score: " + Integer.toString(score));
                window.add(text);
                window.add(exit);
                exit.repaint();
            }
        });
        //exit button clicked
        exit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                window.dispose();
            }
        });
    }//end main
}//end class