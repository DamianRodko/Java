package Games;
import java.awt.TextField;
import java.awt.event.*;
import javax.swing.*;
public class GameMenu extends Thread
{
    private static int x_avatar = 965;
    private static int y_avatar = 1025;
    private static double result = 0.0;
    
    
    
    public static void main(String []args)
    {
        JFrame window = new JFrame("Game menu");
        window.setSize(350,550);
        window.setLayout(null);
        window.setVisible(true);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //add number calculator
        JButton number = new JButton("Calculator");
        number.setBounds(0, 0, 150, 50);
        window.add(number);
        //add BMI calculator
        JButton maze = new JButton("Maze game");
        maze.setBounds(0, 100, 150, 50);
        window.add(maze);
        //add dog years converter
        JButton simon = new JButton("Simon says");
        simon.setBounds(150, 0, 160, 50);
        window.add(simon);
        //add caesarCipher converter
        JButton caesarCipher = new JButton("Connect 4");
        caesarCipher.setBounds(65, 50, 170, 50);
        window.add(caesarCipher);
        //add tetris
        JButton tetris = new JButton("Tetris");
        tetris.setBounds(150, 100, 150, 50);
        window.add(tetris);
        //add exit button
        JButton exit = new JButton("EXIT");
        exit.setBounds(0, 300, 100, 50);
        window.add(exit);
        //add back button
        JButton back = new JButton("BACK");
        back.setBounds(100, 300, 100, 50);
        back.setVisible(false);
        window.add(back);
        //add text
        TextField text = new TextField();
        text.setBounds(100, 350, 150, 20);
        //exit button clicked
        exit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                window.dispose();
            }
        });
        number.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                window.setVisible(false);
                JFrame calculatorWindow = new JFrame("Calculator");
                calculatorWindow.setSize(350,550);
                calculatorWindow.setLayout(null);
                calculatorWindow.setVisible(true);
                calculatorWindow.setResizable(false);
                calculatorWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                //add number calculator
                JButton number = new JButton("Number calculator");
                number.setBounds(0, 0, 150, 50);
                calculatorWindow.add(number);
                //add BMI calculator
                JButton bmi = new JButton("BMI calculator");
                bmi.setBounds(0, 100, 150, 50);
                calculatorWindow.add(bmi);
                //add dog years converter
                JButton dog = new JButton("Dog years calculator");
                dog.setBounds(150, 0, 160, 50);
                calculatorWindow.add(dog);
                //add temperature converter
                JButton temperature = new JButton("Temperature converter");
                temperature.setBounds(65, 50, 170, 50);
                calculatorWindow.add(temperature);
                //add currency converter
                JButton currency = new JButton("Currency converter");
                currency.setBounds(150, 100, 150, 50);
                calculatorWindow.add(currency);
                //add exit button
                JButton exit = new JButton("EXIT");
                exit.setBounds(0, 300, 100, 50);
                calculatorWindow.add(exit);
                //add back button
                JButton back = new JButton("BACK");
                back.setBounds(100, 300, 100, 50);
                back.setVisible(false);
                calculatorWindow.add(back);
                //add text
                TextField text = new TextField();
                text.setBounds(100, 350, 150, 20);
                //exit button clicked
                exit.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        calculatorWindow.dispose();
                        window.setVisible(true);
                    }
                });
                //number calculator button clicked
                number.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        number.setVisible(false);
                        bmi.setVisible(false);
                        dog.setVisible(false);
                        temperature.setVisible(false);
                        currency.setVisible(false);
                        back.setVisible(true);
                        JLabel firstNum = new JLabel("First number");
                        firstNum.setBounds(0, 50, 300, 30);
                        JLabel secondNum = new JLabel("Second number");
                        secondNum.setBounds(0, 100, 100, 30);
                        calculatorWindow.add(firstNum);
                        calculatorWindow.add(secondNum);
                        // Create two JTextFields for the two inputs for calculator
                        JTextField num1 = new JTextField();
                        num1.setBounds(100, 50, 100, 20);
                        num1.setEditable(true);
                        calculatorWindow.add(num1);
                        JTextField num2 = new JTextField();
                        num2.setBounds(100, 100, 100, 20);
                        num2.setEditable(true);
                        calculatorWindow.add(num2);
                        // Create a button for each operation
                        JButton addButton = new JButton("+");
                        addButton.setBounds(200, 50, 50, 20);
                        calculatorWindow.add(addButton);
                        // ActionListener to do addition
                        addButton.addActionListener(new ActionListener()
                        { 
                            public void actionPerformed(ActionEvent e)
                            {
                                result = Double.parseDouble(num1.getText()) + Double.parseDouble(num2.getText());
                            }
                        });
                        // Add Code for subtraction button
                        JButton subtractButton = new JButton("-");
                        subtractButton.setBounds(200, 100, 50, 20);
                        calculatorWindow.add(subtractButton);
                        // Add Code for subtraction ActionListener 
                        subtractButton.addActionListener(new ActionListener()
                        { 
                            public void actionPerformed(ActionEvent e)
                            {
                                result = Double.parseDouble(num1.getText()) - Double.parseDouble(num2.getText());
                            }
                        });
                        // Add Code for multiplication button
                        JButton multiplyButton = new JButton("x");
                        multiplyButton.setBounds(200, 150, 50, 20);
                        calculatorWindow.add(multiplyButton);
                        // Add Code for multiplication ActionListener 
                        multiplyButton.addActionListener(new ActionListener()
                        { 
                            public void actionPerformed(ActionEvent e)
                            {
                                result = Double.parseDouble(num1.getText()) * Double.parseDouble(num2.getText());
                            }
                        });
                        // Add Code for division button
                        JButton divideButton = new JButton("÷");
                        divideButton.setBounds(200, 200, 50, 20);
                        calculatorWindow.add(divideButton);
                        // Add Code for division ActionListener 
                        divideButton.addActionListener(new ActionListener()
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                result = Double.parseDouble(num1.getText()) / Double.parseDouble(num2.getText());
                            }
                        });
                        // Add Code for exponent button
                        JButton exponentButton = new JButton("^");
                        exponentButton.setBounds(200, 250, 50, 20);
                        calculatorWindow.add(exponentButton);
                        // Add Code for division ActionListener 
                        exponentButton.addActionListener(new ActionListener()
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                result = Math.pow(Double.parseDouble(num1.getText()), Double.parseDouble(num2.getText()));
                            }
                        });
                        // Display Result JLabel
                        JLabel resultLabel = new JLabel("Result");
                        resultLabel.setBounds(200, 350, 100, 30);
                        resultLabel.setVisible(false);
                        calculatorWindow.add(resultLabel);
                        // Create equals button to press for result to display
                        JButton equalButton = new JButton("=");
                        equalButton.setBounds(200, 300, 50, 40);
                        calculatorWindow.add(equalButton);
                        // ActionListener to display result
                        equalButton.addActionListener(new ActionListener()
                        { 
                            public void actionPerformed(ActionEvent e)
                            { 
                                resultLabel.setText("Result: " + result);
                                resultLabel.setVisible(true);
                            }
                        });
                        //back button clicked
                        back.addActionListener(new ActionListener()
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                number.setVisible(true);
                                bmi.setVisible(true);
                                dog.setVisible(true);
                                temperature.setVisible(true);
                                currency.setVisible(true);
                                back.setVisible(false);
                                equalButton.setVisible(false);
                                resultLabel.setVisible(false);
                                divideButton.setVisible(false);
                                multiplyButton.setVisible(false);
                                subtractButton.setVisible(false);
                                addButton.setVisible(false);
                                firstNum.setVisible(false);
                                secondNum.setVisible(false);
                                num1.setVisible(false);
                                num2.setVisible(false);
                                exponentButton.setVisible(false);
                            }
                        });
                        calculatorWindow.setVisible(true);
                    }
                });
                //bmi button clicked
                bmi.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        number.setVisible(false);
                        bmi.setVisible(false);
                        dog.setVisible(false);
                        temperature.setVisible(false);
                        currency.setVisible(false);
                        back.setVisible(true);
                        //ask imperial or metric
                        JLabel choice = new JLabel("Enter Imperial or Metric: ");
                        choice.setBounds(0, 50, 300, 30);
                        calculatorWindow.add(choice);
                        //imperial button
                        JButton imperial = new JButton("Imperial");
                        imperial.setBounds(0, 100, 100, 20);
                        calculatorWindow.add(imperial);
                        //metric button
                        JButton metric = new JButton("Metric");
                        metric.setBounds(100, 100, 100, 20);
                        calculatorWindow.add(metric);
                        // Display feet JTextField
                        JTextField heightFeet = new JTextField();
                        heightFeet.setBounds(50, 50, 100, 30);
                        heightFeet.setVisible(false);
                        calculatorWindow.add(heightFeet);
                        // Display inches JTextField
                        JTextField heightInches = new JTextField();
                        heightInches.setBounds(50, 100, 100, 30);
                        heightInches.setVisible(false);
                        calculatorWindow.add(heightInches);
                        // Display pounds JTextField
                        JTextField pounds = new JTextField();
                        pounds.setBounds(50, 150, 100, 30);
                        pounds.setVisible(false);
                        calculatorWindow.add(pounds);
                        // Display feet JLabel
                        JLabel feetLabel = new JLabel("Feet: ");
                        feetLabel.setBounds(0, 50, 300, 30);
                        feetLabel.setVisible(false);
                        calculatorWindow.add(feetLabel);
                        // Display Inches JLabel
                        JLabel inchesLabel = new JLabel("Inches: ");
                        inchesLabel.setBounds(0, 100, 100, 30);
                        inchesLabel.setVisible(false);
                        calculatorWindow.add(inchesLabel);
                        // Display Pounds JLabel
                        JLabel poundsLabel = new JLabel("Pounds: ");
                        poundsLabel.setBounds(0, 150, 100, 30);
                        poundsLabel.setVisible(false);
                        calculatorWindow.add(poundsLabel);
                        // Display Centimeters JLabel
                        JLabel centimetersLabel = new JLabel("Centimeters: ");
                        centimetersLabel.setBounds(0, 50, 100, 30);
                        centimetersLabel.setVisible(false);
                        calculatorWindow.add(centimetersLabel);
                        // Display Pounds JLabel
                        JLabel kilogramsLabel = new JLabel("Kilograms: ");
                        kilogramsLabel.setBounds(0, 100, 100, 30);
                        kilogramsLabel.setVisible(false);
                        calculatorWindow.add(kilogramsLabel);
                        // Display Centimeters JTextField
                        JTextField heightCentimeters = new JTextField();
                        heightCentimeters.setBounds(100, 50, 100, 30);
                        heightCentimeters.setVisible(false);
                        calculatorWindow.add(heightCentimeters);
                        // Display Kilograms JTextField
                        JTextField kilograms = new JTextField();
                        kilograms.setBounds(100, 100, 100, 30);
                        kilograms.setVisible(false);
                        calculatorWindow.add(kilograms);
                        // Display Result JLabel
                        JLabel resultLabel = new JLabel("Result");
                        resultLabel.setBounds(50, 200, 300, 30);
                        resultLabel.setVisible(false);
                        calculatorWindow.add(resultLabel);
                        // Create equals button to press for result to display
                        JButton equalButton = new JButton("=");
                        equalButton.setBounds(200, 100, 50, 30);
                        equalButton.setVisible(false);
                        calculatorWindow.add(equalButton);
                        //back button clicked
                        back.addActionListener(new ActionListener()
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                number.setVisible(true);
                                bmi.setVisible(true);
                                dog.setVisible(true);
                                temperature.setVisible(true);
                                currency.setVisible(true);
                                back.setVisible(false);
                                imperial.setVisible(false);
                                metric.setVisible(false);
                                choice.setVisible(false);
                            }
                        });
                        // Add Code for imperial ActionListener 
                        imperial.addActionListener(new ActionListener()
                        { 
                            public void actionPerformed(ActionEvent e)
                            {
                                imperial.setVisible(false);
                                metric.setVisible(false);
                                heightFeet.setVisible(true);
                                heightInches.setVisible(true);
                                pounds.setVisible(true);
                                choice.setVisible(false);
                                feetLabel.setVisible(true);
                                inchesLabel.setVisible(true);
                                poundsLabel.setVisible(true);
                                equalButton.setVisible(true);
                                //back button clicked
                                back.addActionListener(new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        number.setVisible(true);
                                        bmi.setVisible(true);
                                        dog.setVisible(true);
                                        temperature.setVisible(true);
                                        currency.setVisible(true);
                                        back.setVisible(false);
                                        equalButton.setVisible(false);
                                        heightFeet.setVisible(false);
                                        heightInches.setVisible(false);
                                        pounds.setVisible(false);
                                        feetLabel.setVisible(false);
                                        inchesLabel.setVisible(false);
                                        poundsLabel.setVisible(false);
                                        resultLabel.setVisible(false);
                                    }
                                });
                                // ActionListener to display result
                                equalButton.addActionListener(new ActionListener()
                                { 
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        Double heightTotalInch = (Double.parseDouble(heightFeet.getText()) * 12) + Double.parseDouble(heightInches.getText());
                                        Double bmi = (Double.parseDouble(pounds.getText()) / (heightTotalInch * heightTotalInch)) * 703;
                                        if (bmi < 18.5)
                                        {
                                            resultLabel.setText("Your BMI is: " + Math.round(bmi * 100)/100.0 + " and you are underweight.");
                                        }
                                        else if(bmi > 18.5 && bmi < 24.9)
                                        {
                                            resultLabel.setText("Your BMI is: " + Math.round(bmi * 100)/100.0 + " and you are normal.");
                                        }
                                        else if(bmi > 25 && bmi < 29.9)
                                        {
                                            resultLabel.setText("Your BMI is: " + Math.round(bmi * 100)/100.0 + " and you are overweight.");
                                        }
                                        else
                                        {
                                            resultLabel.setText("Your BMI is: " + Math.round(bmi * 100)/100.0 + " and you are obese.");
                                        }
                                        resultLabel.setVisible(true);
                                    }
                                });
                            }
                        });
                        // Add Code for metric ActionListener 
                        metric.addActionListener(new ActionListener()
                        { 
                            public void actionPerformed(ActionEvent e)
                            {
                                imperial.setVisible(false);
                                metric.setVisible(false);
                                heightCentimeters.setVisible(true);
                                kilograms.setVisible(true);
                                choice.setVisible(false);
                                centimetersLabel.setVisible(true);
                                kilogramsLabel.setVisible(true);
                                equalButton.setVisible(true);
                                //back button clicked
                                back.addActionListener(new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        number.setVisible(true);
                                        bmi.setVisible(true);
                                        dog.setVisible(true);
                                        temperature.setVisible(true);
                                        currency.setVisible(true);
                                        back.setVisible(false);
                                        equalButton.setVisible(false);
                                        kilogramsLabel.setVisible(false);
                                        centimetersLabel.setVisible(false);
                                        kilograms.setVisible(false);
                                        heightCentimeters.setVisible(false);
                                    }
                                });
                                // ActionListener to display result
                                equalButton.addActionListener(new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        Double heightTotalCentimeters = (Double.parseDouble(heightCentimeters.getText()) / 100);
                                        Double bmi = Double.parseDouble(kilograms.getText()) / (heightTotalCentimeters * heightTotalCentimeters);
                                        if (bmi < 18.5)
                                        {
                                            resultLabel.setText("Your BMI is: " + Math.round(bmi * 100)/100.0 + " and you are underweight.");
                                        }
                                        else if(bmi > 18.5 && bmi < 24.9)
                                        {
                                            resultLabel.setText("Your BMI is: " + Math.round(bmi * 100)/100.0 + " and you are normal.");
                                        }
                                        else if(bmi > 25 && bmi < 29.9)
                                        {
                                            resultLabel.setText("Your BMI is: " + Math.round(bmi * 100)/100.0 + " and you are overweight.");
                                        }
                                        else
                                        {
                                            resultLabel.setText("Your BMI is: " + Math.round(bmi * 100)/100.0 + " and you are obese.");
                                        }
                                        resultLabel.setVisible(true);
                                    }
                                });
                            }
                        });
                    }
                });
                // Add Code for dog ActionListener 
                dog.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                    {
                        number.setVisible(false);
                        bmi.setVisible(false);
                        dog.setVisible(false);
                        temperature.setVisible(false);
                        currency.setVisible(false);
                        back.setVisible(true);
                        //dogToHuman button
                        JButton dogToHuman = new JButton("Dog to human years");
                        dogToHuman.setBounds(0, 0, 150, 20);
                        calculatorWindow.add(dogToHuman);
                        //humanToDog button
                        JButton humanToDog = new JButton("Human to dog years");
                        humanToDog.setBounds(150, 0, 150, 20);
                        calculatorWindow.add(humanToDog);
                        // Display dogYears JTextField
                        JTextField dogYears = new JTextField();
                        dogYears.setBounds(0, 25, 100, 30);
                        dogYears.setVisible(false);
                        calculatorWindow.add(dogYears);
                        // Display humanYears JTextField
                        JTextField humanYears = new JTextField();
                        humanYears.setBounds(0, 25, 100, 30);
                        humanYears.setVisible(false);
                        calculatorWindow.add(humanYears);
                        // Display dogYearsLabel JLabel
                        JLabel dogYearsLabel = new JLabel("Dog years: ");
                        dogYearsLabel.setBounds(0, 0, 300, 30);
                        dogYearsLabel.setVisible(false);
                        calculatorWindow.add(dogYearsLabel);
                        // Display humanYearsLabel JLabel
                        JLabel humanYearsLabel = new JLabel("Human years: ");
                        humanYearsLabel.setBounds(0, 0, 100, 30);
                        humanYearsLabel.setVisible(false);
                        calculatorWindow.add(humanYearsLabel);
                        // Display Result JLabel
                        JLabel resultLabel = new JLabel("Result");
                        resultLabel.setBounds(0, 50, 300, 30);
                        resultLabel.setVisible(false);
                        calculatorWindow.add(resultLabel);
                        // Create equals button to press for result to display
                        JButton equalButton = new JButton("=");
                        equalButton.setBounds(100, 25, 50, 30);
                        equalButton.setVisible(false);
                        calculatorWindow.add(equalButton);
                        //back button clicked
                        back.addActionListener(new ActionListener()
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                number.setVisible(true);
                                bmi.setVisible(true);
                                dog.setVisible(true);
                                temperature.setVisible(true);
                                currency.setVisible(true);
                                back.setVisible(false);
                                dogToHuman.setVisible(false);
                                humanToDog.setVisible(false);
                            }
                        });
                        // Add Code for dogToHuman ActionListener 
                        dogToHuman.addActionListener(new ActionListener()
                        { 
                            public void actionPerformed(ActionEvent e)
                            {
                                dogToHuman.setVisible(false);
                                humanToDog.setVisible(false);
                                dogYears.setVisible(true);
                                dogYearsLabel.setVisible(true);
                                equalButton.setVisible(true);
                                //back button clicked
                                back.addActionListener(new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        number.setVisible(true);
                                        bmi.setVisible(true);
                                        dog.setVisible(true);
                                        temperature.setVisible(true);
                                        currency.setVisible(true);
                                        back.setVisible(false);
                                        equalButton.setVisible(false);
                                        dogYears.setVisible(false);
                                        dogYearsLabel.setVisible(false);
                                        resultLabel.setVisible(false);
                                    }
                                });
                                // ActionListener to display result
                                equalButton.addActionListener(new ActionListener()
                                { 
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        Double conversion = (Double.parseDouble(dogYears.getText()) / 7);
                                        resultLabel.setText("Human years: " + Math.round(conversion * 100)/100.0);
                                        resultLabel.setVisible(true);
                                    }
                                });
                            }
                        });
                        // Add Code for humanToDog ActionListener 
                        humanToDog.addActionListener(new ActionListener()
                        { 
                            public void actionPerformed(ActionEvent e)
                            {
                                dogToHuman.setVisible(false);
                                humanToDog.setVisible(false);
                                humanYears.setVisible(true);
                                humanYearsLabel.setVisible(true);
                                equalButton.setVisible(true);
                                //back button clicked
                                back.addActionListener(new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        number.setVisible(true);
                                        bmi.setVisible(true);
                                        dog.setVisible(true);
                                        temperature.setVisible(true);
                                        currency.setVisible(true);
                                        back.setVisible(false);
                                        humanYears.setVisible(false);
                                        humanYearsLabel.setVisible(false);
                                        resultLabel.setVisible(false);
                                        equalButton.setVisible(false);
                                    }
                                });
                                // ActionListener to display result
                                equalButton.addActionListener(new ActionListener()
                                { 
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        Double conversion = (Double.parseDouble(humanYears.getText()) * 7);
                                        resultLabel.setText("Dog years: " + Math.round(conversion * 100)/100.0);
                                        resultLabel.setVisible(true);
                                    }
                                });
                            }
                        });
                    }
                });
                // Add Code for currency ActionListener 
                currency.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        number.setVisible(false);
                        bmi.setVisible(false);
                        dog.setVisible(false);
                        temperature.setVisible(false);
                        currency.setVisible(false);
                        back.setVisible(true);
                        //USDToEUR button
                        JButton USDToEUR = new JButton("USD to EUR");
                        USDToEUR.setBounds(0, 0, 100, 20);
                        calculatorWindow.add(USDToEUR);
                        //EURToUSD button
                        JButton EURToUSD = new JButton("EUR to USD");
                        EURToUSD.setBounds(0, 50 , 100, 20);
                        calculatorWindow.add(EURToUSD);
                        //USDToJPY button
                        JButton USDToJPY = new JButton("USD to JPY");
                        USDToJPY.setBounds(0, 100, 100, 20);
                        calculatorWindow.add(USDToJPY);
                        //JPYToUSD button
                        JButton JPYToUSD = new JButton("JPY to USD");
                        JPYToUSD.setBounds(0, 150, 100, 20);
                        calculatorWindow.add(JPYToUSD);
                        // Display USD JTextField
                        JTextField USD = new JTextField();
                        USD.setBounds(0, 25, 100, 30);
                        USD.setVisible(false);
                        calculatorWindow.add(USD);
                        // Display EUR JTextField
                        JTextField EUR = new JTextField();
                        EUR.setBounds(0, 25, 100, 30);
                        EUR.setVisible(false);
                        calculatorWindow.add(EUR);
                        // Display JPY JTextField
                        JTextField JPY = new JTextField();
                        JPY.setBounds(0, 25, 100, 30);
                        JPY.setVisible(false);
                        calculatorWindow.add(JPY);
                        // Display USDLabel JLabel
                        JLabel USDLabel = new JLabel("Enter USD: ");
                        USDLabel.setBounds(0, 0, 300, 30);
                        USDLabel.setVisible(false);
                        calculatorWindow.add(USDLabel);
                        // Display EURLabel JLabel
                        JLabel EURLabel = new JLabel("Enter EUR: ");
                        EURLabel.setBounds(0, 0, 100, 30);
                        EURLabel.setVisible(false);
                        calculatorWindow.add(EURLabel);
                        // Display JPYLabel JLabel
                        JLabel JPYLabel = new JLabel("Enter JPY: ");
                        JPYLabel.setBounds(0, 0, 300, 30);
                        JPYLabel.setVisible(false);
                        calculatorWindow.add(JPYLabel);
                        // Display Result JLabel
                        JLabel resultLabel = new JLabel("Result");
                        resultLabel.setBounds(0, 50, 300, 30);
                        resultLabel.setVisible(false);
                        calculatorWindow.add(resultLabel);
                        // Create equals button to press for result to display
                        JButton equalButton = new JButton("=");
                        equalButton.setBounds(100, 25, 50, 30);
                        equalButton.setVisible(false);
                        calculatorWindow.add(equalButton);
                        //back button clicked
                        back.addActionListener(new ActionListener()
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                number.setVisible(true);
                                bmi.setVisible(true);
                                dog.setVisible(true);
                                temperature.setVisible(true);
                                currency.setVisible(true);
                                back.setVisible(false);
                                USDToEUR.setVisible(false);
                                EURToUSD.setVisible(false);
                                USDToJPY.setVisible(false);
                                JPYToUSD.setVisible(false);
                            }
                        });
                        // Add Code for USDToEUR ActionListener 
                        USDToEUR.addActionListener(new ActionListener()
                        { 
                            public void actionPerformed(ActionEvent e)
                            {
                                USDToEUR.setVisible(false);
                                EURToUSD.setVisible(false);
                                USDToJPY.setVisible(false);
                                JPYToUSD.setVisible(false);
                                USD.setVisible(true);
                                USDLabel.setVisible(true);
                                equalButton.setVisible(true);
                                //back button clicked
                                back.addActionListener(new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        number.setVisible(true);
                                        bmi.setVisible(true);
                                        dog.setVisible(true);
                                        temperature.setVisible(true);
                                        currency.setVisible(true);
                                        back.setVisible(false);
                                        equalButton.setVisible(false);
                                        USD.setVisible(false);
                                        USDLabel.setVisible(false);
                                        resultLabel.setVisible(false);
                                    }
                                });
                                // ActionListener to display result
                                equalButton.addActionListener(new ActionListener()
                                { 
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        double EUR = (Double.parseDouble(USD.getText()) * 0.94);
                                        resultLabel.setText("EUR: " + Math.round(EUR * 100)/100.0);
                                        resultLabel.setVisible(true);
                                    }
                                });
                            }
                        });
                        // Add Code for EURToUSD ActionListener 
                        EURToUSD.addActionListener(new ActionListener()
                        { 
                            public void actionPerformed(ActionEvent e)
                            {
                                USDToEUR.setVisible(false);
                                EURToUSD.setVisible(false);
                                USDToJPY.setVisible(false);
                                JPYToUSD.setVisible(false);
                                EUR.setVisible(true);
                                EURLabel.setVisible(true);
                                equalButton.setVisible(true);
                                //back button clicked
                                back.addActionListener(new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        number.setVisible(true);
                                        bmi.setVisible(true);
                                        dog.setVisible(true);
                                        temperature.setVisible(true);
                                        currency.setVisible(true);
                                        back.setVisible(false);
                                        equalButton.setVisible(false);
                                        EUR.setVisible(false);
                                        EURLabel.setVisible(false);
                                        resultLabel.setVisible(false);
                                    }
                                });
                                // ActionListener to display result
                                equalButton.addActionListener(new ActionListener()
                                { 
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        double USD = (Double.parseDouble(EUR.getText()) * 1.06);
                                        resultLabel.setText("USD: " + Math.round(USD * 100)/100.0);
                                        resultLabel.setVisible(true);
                                    }
                                });
                            }
                        });
                        // Add Code for USDToJPY ActionListener 
                        USDToJPY.addActionListener(new ActionListener()
                        { 
                            public void actionPerformed(ActionEvent e)
                            {
                                USDToEUR.setVisible(false);
                                EURToUSD.setVisible(false);
                                USDToJPY.setVisible(false);
                                JPYToUSD.setVisible(false);
                                USD.setVisible(true);
                                USDLabel.setVisible(true);
                                equalButton.setVisible(true);
                                //back button clicked
                                back.addActionListener(new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        number.setVisible(true);
                                        bmi.setVisible(true);
                                        dog.setVisible(true);
                                        temperature.setVisible(true);
                                        currency.setVisible(true);
                                        back.setVisible(false);
                                        equalButton.setVisible(false);
                                        USD.setVisible(false);
                                        USDLabel.setVisible(false);
                                        resultLabel.setVisible(false);
                                    }
                                });
                                // ActionListener to display result
                                equalButton.addActionListener(new ActionListener()
                                { 
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        double JPY = (Double.parseDouble(USD.getText()) * 149);
                                        resultLabel.setText("JPY: " + Math.round(JPY * 100)/100.0);
                                        resultLabel.setVisible(true);
                                    }
                                });
                            }
                        });
                        // Add Code for JPYToUSD ActionListener 
                        JPYToUSD.addActionListener(new ActionListener()
                        { 
                            public void actionPerformed(ActionEvent e)
                            {
                                USDToEUR.setVisible(false);
                                EURToUSD.setVisible(false);
                                USDToJPY.setVisible(false);
                                JPYToUSD.setVisible(false);
                                JPY.setVisible(true);
                                JPYLabel.setVisible(true);
                                equalButton.setVisible(true);
                                //back button clicked
                                back.addActionListener(new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        number.setVisible(true);
                                        bmi.setVisible(true);
                                        dog.setVisible(true);
                                        temperature.setVisible(true);
                                        currency.setVisible(true);
                                        back.setVisible(false);
                                        equalButton.setVisible(false);
                                        JPY.setVisible(false);
                                        JPYLabel.setVisible(false);
                                        resultLabel.setVisible(false);
                                    }
                                });
                                // ActionListener to display result
                                equalButton.addActionListener(new ActionListener()
                                { 
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        double USD = (Double.parseDouble(JPY.getText()) * 0.0067);
                                        resultLabel.setText("USD: " + Math.round(USD * 100)/100.0);
                                        resultLabel.setVisible(true);
                                    }
                                });
                            }
                        });
                    }
                });
                // Add Code for temperature ActionListener 
                temperature.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        number.setVisible(false);
                        bmi.setVisible(false);
                        dog.setVisible(false);
                        temperature.setVisible(false);
                        currency.setVisible(false);
                        back.setVisible(true);
                        //fToC button
                        JButton fToC = new JButton("Fahrenheit to celsius");
                        fToC.setBounds(0, 0, 200, 20);
                        calculatorWindow.add(fToC);
                        //cToF button
                        JButton cToF = new JButton("Celsius to fahrenheit");
                        cToF.setBounds(0, 50 , 200, 20);
                        calculatorWindow.add(cToF);
                        //fToK button
                        JButton fToK = new JButton("Fahrenheit to kelvin");
                        fToK.setBounds(0, 100, 200, 20);
                        calculatorWindow.add(fToK);
                        //kToF button
                        JButton kToF = new JButton("Kelvin to fahrenheit");
                        kToF.setBounds(0, 150, 200, 20);
                        calculatorWindow.add(kToF);
                        //cToK button
                        JButton cToK = new JButton("Celsius to kelvin");
                        cToK.setBounds(0, 200, 200, 20);
                        calculatorWindow.add(cToK);
                        //kToC button
                        JButton kToC = new JButton("Kelvin to Celsius");
                        kToC.setBounds(0, 250, 200, 20);
                        calculatorWindow.add(kToC);
                        // Display fahrenheit JTextField
                        JTextField fahrenheit = new JTextField();
                        fahrenheit.setBounds(0, 25, 100, 30);
                        fahrenheit.setVisible(false);
                        calculatorWindow.add(fahrenheit);
                        // Display celsius JTextField
                        JTextField celsius = new JTextField();
                        celsius.setBounds(0, 25, 100, 30);
                        celsius.setVisible(false);
                        calculatorWindow.add(celsius);
                        // Display kelvin JTextField
                        JTextField kelvin = new JTextField();
                        kelvin.setBounds(0, 25, 100, 30);
                        kelvin.setVisible(false);
                        calculatorWindow.add(kelvin);
                        // Display celsiusLabel JLabel
                        JLabel celsiusLabel = new JLabel("Enter celsius: ");
                        celsiusLabel.setBounds(0, 0, 300, 30);
                        celsiusLabel.setVisible(false);
                        calculatorWindow.add(celsiusLabel);
                        // Display fahrenheitLabel JLabel
                        JLabel fahrenheitLabel = new JLabel("Enter fahrenheit: ");
                        fahrenheitLabel.setBounds(0, 0, 100, 30);
                        fahrenheitLabel.setVisible(false);
                        calculatorWindow.add(fahrenheitLabel);
                        // Display kelvinLabel JLabel
                        JLabel kelvinLabel = new JLabel("Enter kelvin: ");
                        kelvinLabel.setBounds(0, 0, 300, 30);
                        kelvinLabel.setVisible(false);
                        calculatorWindow.add(kelvinLabel);
                        // Display Result JLabel
                        JLabel resultLabel = new JLabel("Result");
                        resultLabel.setBounds(0, 50, 300, 30);
                        resultLabel.setVisible(false);
                        calculatorWindow.add(resultLabel);
                        // Create equals button to press for result to display
                        JButton equalButton = new JButton("=");
                        equalButton.setBounds(100, 25, 50, 30);
                        equalButton.setVisible(false);
                        calculatorWindow.add(equalButton);
                        //back button clicked
                        back.addActionListener(new ActionListener()
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                number.setVisible(true);
                                bmi.setVisible(true);
                                dog.setVisible(true);
                                temperature.setVisible(true);
                                currency.setVisible(true);
                                back.setVisible(false);
                                fToC.setVisible(false);
                                cToF.setVisible(false);
                                fToK.setVisible(false);
                                kToF.setVisible(false);
                                cToK.setVisible(false);
                                kToC.setVisible(false);
                            }
                        });
                        // Add Code for USDToEUR ActionListener 
                        fToC.addActionListener(new ActionListener()
                        { 
                            public void actionPerformed(ActionEvent e)
                            {
                                back.setVisible(true);
                                fToC.setVisible(false);
                                cToF.setVisible(false);
                                fToK.setVisible(false);
                                kToF.setVisible(false);
                                cToK.setVisible(false);
                                kToC.setVisible(false);
                                fahrenheit.setVisible(true);
                                fahrenheitLabel.setVisible(true);
                                equalButton.setVisible(true);
                                //back button clicked
                                back.addActionListener(new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        number.setVisible(true);
                                        bmi.setVisible(true);
                                        dog.setVisible(true);
                                        temperature.setVisible(true);
                                        currency.setVisible(true);
                                        back.setVisible(false);
                                        equalButton.setVisible(false);
                                        resultLabel.setVisible(false);
                                        fahrenheit.setVisible(false);
                                        fahrenheitLabel.setVisible(false);
                                    }
                                });
                                // ActionListener to display result
                                equalButton.addActionListener(new ActionListener()
                                { 
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        double celsius = (Double.parseDouble(fahrenheit.getText()) - 32) / 1.8;
                                        resultLabel.setText("Celsius: " + Math.round(celsius * 100)/100.0);
                                        resultLabel.setVisible(true);
                                    }
                                });
                            }
                        });
                        // Add Code for cToF ActionListener 
                        cToF.addActionListener(new ActionListener()
                        { 
                            public void actionPerformed(ActionEvent e)
                            {
                                back.setVisible(true);
                                fToC.setVisible(false);
                                cToF.setVisible(false);
                                fToK.setVisible(false);
                                kToF.setVisible(false);
                                cToK.setVisible(false);
                                kToC.setVisible(false);
                                celsius.setVisible(true);
                                celsiusLabel.setVisible(true);
                                equalButton.setVisible(true);
                                //back button clicked
                                back.addActionListener(new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        number.setVisible(true);
                                        bmi.setVisible(true);
                                        dog.setVisible(true);
                                        temperature.setVisible(true);
                                        currency.setVisible(true);
                                        back.setVisible(false);
                                        equalButton.setVisible(false);
                                        resultLabel.setVisible(false);
                                        celsius.setVisible(false);
                                        celsiusLabel.setVisible(false);
                                    }
                                });
                                // ActionListener to display result
                                equalButton.addActionListener(new ActionListener()
                                { 
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        double fahrenheit = (Double.parseDouble(celsius.getText()) * 1.8) + 32;
                                        resultLabel.setText("Fahrenheit: " + Math.round(fahrenheit * 100)/100.0);
                                        resultLabel.setVisible(true);
                                    }
                                });
                            }
                        });
                        fToK.addActionListener(new ActionListener()
                        { 
                            public void actionPerformed(ActionEvent e)
                            {
                                back.setVisible(true);
                                fToC.setVisible(false);
                                cToF.setVisible(false);
                                fToK.setVisible(false);
                                kToF.setVisible(false);
                                cToK.setVisible(false);
                                kToC.setVisible(false);
                                fahrenheit.setVisible(true);
                                fahrenheitLabel.setVisible(true);
                                equalButton.setVisible(true);
                                //back button clicked
                                back.addActionListener(new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        number.setVisible(true);
                                        bmi.setVisible(true);
                                        dog.setVisible(true);
                                        temperature.setVisible(true);
                                        currency.setVisible(true);
                                        back.setVisible(false);
                                        equalButton.setVisible(false);
                                        resultLabel.setVisible(false);
                                        fahrenheit.setVisible(false);
                                        fahrenheitLabel.setVisible(false);
                                    }
                                });
                                // ActionListener to display result
                                equalButton.addActionListener(new ActionListener()
                                { 
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        double kelvin = ((((Double.parseDouble(fahrenheit.getText()) - 32) * 5) / 9) + 273.15);
                                        resultLabel.setText("Kelvin: " + Math.round(kelvin * 100)/100.0);
                                        resultLabel.setVisible(true);
                                    }
                                });
                            }
                        });
                        kToF.addActionListener(new ActionListener()
                        { 
                            public void actionPerformed(ActionEvent e)
                            {
                                back.setVisible(true);
                                fToC.setVisible(false);
                                cToF.setVisible(false);
                                fToK.setVisible(false);
                                kToF.setVisible(false);
                                cToK.setVisible(false);
                                kToC.setVisible(false);
                                kelvin.setVisible(true);
                                kelvinLabel.setVisible(true);
                                equalButton.setVisible(true);
                                //back button clicked
                                back.addActionListener(new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        number.setVisible(true);
                                        bmi.setVisible(true);
                                        dog.setVisible(true);
                                        temperature.setVisible(true);
                                        currency.setVisible(true);
                                        back.setVisible(false);
                                        equalButton.setVisible(false);
                                        resultLabel.setVisible(false);
                                        kelvin.setVisible(false);
                                        kelvinLabel.setVisible(false);
                                    }
                                });
                                // ActionListener to display result
                                equalButton.addActionListener(new ActionListener()
                                { 
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        double fahrenheit = ((Double.parseDouble(kelvin.getText()) - 273.15) * 1.8) + 32;
                                        resultLabel.setText("Fahrenheit: " + Math.round(fahrenheit * 100)/100.0);
                                        resultLabel.setVisible(true);
                                    }
                                });
                            }
                        });
                        cToK.addActionListener(new ActionListener()
                        { 
                            public void actionPerformed(ActionEvent e)
                            {
                                back.setVisible(true);
                                fToC.setVisible(false);
                                cToF.setVisible(false);
                                fToK.setVisible(false);
                                kToF.setVisible(false);
                                cToK.setVisible(false);
                                kToC.setVisible(false);
                                celsius.setVisible(true);
                                celsiusLabel.setVisible(true);
                                equalButton.setVisible(true);
                                //back button clicked
                                back.addActionListener(new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        number.setVisible(true);
                                        bmi.setVisible(true);
                                        dog.setVisible(true);
                                        temperature.setVisible(true);
                                        currency.setVisible(true);
                                        back.setVisible(false);
                                        equalButton.setVisible(false);
                                        resultLabel.setVisible(false);
                                        celsius.setVisible(false);
                                        celsiusLabel.setVisible(false);
                                    }
                                });
                                // ActionListener to display result
                                equalButton.addActionListener(new ActionListener()
                                { 
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        double kelvin = (Double.parseDouble(celsius.getText()) + 273.15);
                                        resultLabel.setText("Kelvin: " + Math.round(kelvin * 100)/100.0);
                                        resultLabel.setVisible(true);
                                    }
                                });
                            }
                        });
                        //kelvin to celsius conversion
                        kToC.addActionListener(new ActionListener()
                        { 
                            public void actionPerformed(ActionEvent e)
                            {
                                back.setVisible(true);
                                fToC.setVisible(false);
                                cToF.setVisible(false);
                                fToK.setVisible(false);
                                kToF.setVisible(false);
                                cToK.setVisible(false);
                                kToC.setVisible(false);
                                kelvin.setVisible(true);
                                kelvinLabel.setVisible(true);
                                equalButton.setVisible(true);
                                //back button clicked
                                back.addActionListener(new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        number.setVisible(true);
                                        bmi.setVisible(true);
                                        dog.setVisible(true);
                                        temperature.setVisible(true);
                                        currency.setVisible(true);
                                        back.setVisible(false);
                                        equalButton.setVisible(false);
                                        resultLabel.setVisible(false);
                                        kelvin.setVisible(false);
                                        kelvinLabel.setVisible(false);
                                    }
                                });
                                // ActionListener to display result
                                equalButton.addActionListener(new ActionListener()
                                { 
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        double celsius = (Double.parseDouble(kelvin.getText()) - 273.15);
                                        resultLabel.setText("Celsius: " + Math.round(celsius * 100)/100.0);
                                        resultLabel.setVisible(true);
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
        maze.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                window.setVisible(false);
            }
        });
    }//end main
}//end class
