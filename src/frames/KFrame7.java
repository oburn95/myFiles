/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import utilities.Random;

/**
 *
 * @author Sean
 */
public class KFrame7 extends JFrame implements ActionListener {
     JButton blueButton;
     JButton redButton;
     JButton greenButton;
     JButton yellowButton;
     JPanel reflector;
     JTextField input;
     JButton colorButton;

    public KFrame7(String title) {
        
        super(title);
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponents(getContentPane());
        addListeners();
        setVisible(true);
     
    }
  
    
     @Override
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        if (event.getSource() instanceof JTextField) {
            input.setText("");
        }
        if (command.equalsIgnoreCase("Red")) {
            reflector.setBackground(Color.RED);
        } else if (command.equalsIgnoreCase("Yellow")){
             reflector.setBackground(Color.YELLOW);
        }else if (command.equalsIgnoreCase("Blue")){
            reflector.setBackground(Color.BLUE);
        }else if (command.equalsIgnoreCase("Green")){
            reflector.setBackground(Color.GREEN);
        }else if (command.equalsIgnoreCase("Color")){
            reflector.setBackground(Random.color());
        }
    }

    private void addComponents(Container contentPane) {
        blueButton = new JButton("Blue");
        redButton = new JButton("Red");
        greenButton = new JButton("Green");
        yellowButton = new JButton("Yellow");
        colorButton = new JButton("Color");
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        controlPanel.add(blueButton);
        controlPanel.add(redButton);
        controlPanel.add(greenButton);
        controlPanel.add(yellowButton);
        controlPanel.add(colorButton);
        reflector = new JPanel();
        input = new JTextField();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(controlPanel, BorderLayout.NORTH);
        contentPane.add(reflector, BorderLayout.CENTER);
        contentPane.add(input, BorderLayout.SOUTH);
        
    }

    private void addListeners() {
        blueButton.addActionListener(this);
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        yellowButton.addActionListener(this);
        colorButton.addActionListener(this);
        input.addActionListener(this);
        
    }
    
  
    
}
