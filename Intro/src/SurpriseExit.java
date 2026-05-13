import javax.swing.*;
import java.awt.event.*;
public class SurpriseExit
{
    public static void main(String[] args)
    {
        JFrame window = new JFrame("Damian's Super Awesome Window");
        window.setSize(700, 800);
        window.setLayout(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        //add click me button
        JButton button1 = new JButton("Click me for a surprise!");
        button1.setBounds(100, 100, 300, 50);
        window.add(button1);
        
        //add exit button
        JButton button2 = new JButton("Surprise! Now click me to exit the program.");
        button2.setBounds(100, 150, 300, 50);
        button2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                window.dispose();
            }
        });
        //add exit button
        button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                window.add(button2);
            }
        });
    }
}
