/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sean
 */
public class KFrame8 extends JFrame implements ActionListener {

    JButton pointButton;
    JButton lineButton;
    JButton wordButton;
    JButton quoteButton;
    JButton colorButton;
    JButton clearButton;
    JPanel reflector;
    JTextField input;
    
     public KFrame8(String title) {
        
        super(title);
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponents(getContentPane());
        addListeners();
        setVisible(true);
     
    }
  

    @Override
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        
    }

    private void addComponents(Container contentPane) {
        pointButton = new JButton("Point");
        lineButton = new JButton("Line");
        wordButton = new JButton("Word");
        quoteButton = new JButton("Quote");
        colorButton = new JButton("Color");
        clearButton = new JButton("Clear");
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        controlPanel.add(pointButton);
        controlPanel.add(lineButton);
        controlPanel.add(wordButton);
        controlPanel.add(quoteButton);
        controlPanel.add(colorButton);
        controlPanel.add(clearButton);
        reflector = new JPanel();
        input = new JTextField();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(controlPanel, BorderLayout.NORTH);
        contentPane.add(reflector, BorderLayout.CENTER);
        contentPane.add(input, BorderLayout.CENTER);
    }

    private void addListeners() {
        pointButton.addActionListener(this);
        lineButton.addActionListener(this);
        wordButton.addActionListener(this);
        quoteButton.addActionListener(this);
        colorButton.addActionListener(this);
        clearButton.addActionListener(this);
        input.addActionListener(this);
    }

}
