/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wordcounter;

/**
 *
 * @author sridh
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WordCounter extends JFrame implements ActionListener {
    private final JTextArea txtArea;
    private final JButton cntBtn;
    private final JLabel cntLbl;

    public WordCounter() {
        super("Word Counter");

        txtArea = new JTextArea(10, 30);
        cntBtn = new JButton("Count");
        cntLbl = new JLabel("Word count: 0");

        JPanel panel = new JPanel();
        panel.add(new JScrollPane(txtArea));
        panel.add(cntBtn);
        panel.add(cntLbl);
        add(panel);

        cntBtn.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Get text from the text area
        String inTxt = txtArea.getText();

        // Split text into words and count them
        String[] words = inTxt.split("\\s+");
        int wordCount = words.length;

        // Update the label
        cntLbl.setText("Word count: " + wordCount);
    }

    public static void main(String[] args) {
        new WordCounter();
    }
}

