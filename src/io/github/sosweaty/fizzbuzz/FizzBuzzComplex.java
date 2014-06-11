package io.github.sosweaty.fizzbuzz;

import javax.swing.*;
import java.awt.*;

public class FizzBuzzComplex extends JPanel {

    private final static String newline = "\n";
    private JTextArea textArea;

    private FizzBuzzComplex() {
        super(new GridBagLayout());

        JButton myButton = new JButton("Start FizzBuzz");
        myButton.addActionListener(evt -> {
            //targets set i to 0 if i is less than 1000 than add 1 to i
            for (int i = 0; i <= 1000; i++)
                //if i is a multiple of 3 & 5 print fizzbuzz + i
                if (i % 3 == 0 && i % 5 == 0)
                    textArea.append("FizzBuzz :" + i + newline);

                    //else if i is a multiple of 3 print fizz + i
                else if (i % 3 == 0)
                    textArea.append("Fizz :" + i + newline);

                    //else if i is a multiple of 5 print buzz + i
                else if (i % 5 == 0)
                    textArea.append("Buzz :" + i + newline);
                    //else if i is not a multiple of 5 and 3 print i
                else
                    textArea.append(i + newline);

        });
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        //Add Components to panel
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;

        c.fill = GridBagConstraints.HORIZONTAL;
        add(myButton, c);

        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        add(scrollPane, c);

    }

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("FizzBuzzComplex");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Adds Contents to frame
        frame.add(new FizzBuzzComplex());

        //Sets Frame to 300px, 300px & visible
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Create and show the GUI
        javax.swing.SwingUtilities.invokeLater(FizzBuzzComplex::createAndShowGUI);
    }
}