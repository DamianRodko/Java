import javax.swing.*;
import java.awt.TextField;
import java.awt.event.*;
public class ILoveForestHillsGUI
{
    public static void main(String[] args)
    {
        JFrame window = new JFrame("Damian's Super Awesome Window");
        window.setSize(1000,1000);
        window.setLayout(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        //add click me button
        JButton button1 = new JButton("Click me!");
        button1.setBounds(100, 100, 150, 50);
        window.add(button1);
        
        TextField text = new TextField();
        text.setBounds(100, 350, 150, 20);
        
        button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                text.setText("I love Forest Hills!");
                window.add(text);
            }
        });
        //add exit button
        JButton button2 = new JButton("Exit");
        button2.setBounds(100, 150, 150, 50);
        window.setLayout(null);
        window.setVisible(true);
        window.add(button2);
        
        button2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                window.dispose();
            }
        });
    }
}