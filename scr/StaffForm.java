package scr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StaffForm {

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Text Area Example");

        // Create a JTextArea
        JTextArea textArea = new JTextArea(10, 30); // 10 rows and 30 columns

        // Create a JScrollPane to add the text area with scrolling
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Create a button to retrieve text from the text area
        JButton button = new JButton("Get Text");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                JOptionPane.showMessageDialog(null, "Text in TextArea:\n" + text);
                System.out.println(text);
            }
        });

        // Create a JPanel to hold the button
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(button);

        // Create a main JPanel to hold the text area, scroll pane, and button
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(scrollPane);
        mainPanel.add(buttonPanel);

        // Add the main panel to the JFrame
        frame.add(mainPanel);

        // Set JFrame properties
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
