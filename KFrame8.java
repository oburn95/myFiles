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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import utilities.Random;

/**
 *
 * @author Sean
 */
public class KFrame8 extends JFrame implements ActionListener {
 
      //Variables.
      JTextArea frameArea;             //The background of the frame.
       JTextField frameEnter;          //The text field.   
        JButton pointButton;           //"Point" button.
         JButton lineButton;           //"Line" button. 
          JButton quoteButton;         //"Quote" button.
           JButton definitionButton;   //"Definition" button.
            JButton colorButton;       //"Color" button.
             JButton clearButton;      //"Clear" button.
             
      //END VARIABLES.
              
  
    /**
     *
     * @param title
     */
    public KFrame8(String title) 
      {
            super(title);
             setSize(500, 600);
              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               addComponents(getContentPane());
                addListeners();
                 setVisible(true);
      }
      //END KFRAME8(String title)
      
      //Adds all components to the container.
      private void addComponents(Container contentPane)
      {
    
          pointButton = new JButton("Point");
           clearButton = new JButton("Clear");
            lineButton = new JButton("Line");
             quoteButton = new JButton("Quote");
              definitionButton = new JButton("Definition");
               colorButton = new JButton("Color");
                JPanel panel = new JPanel();
          //1 - Add "point" button to the panel.  
          //2 - Add "Clear" button to the panel.
          //3 - Add "Line" button to the panel.
         //4 - Add "Quote" button to the panel.
          //5 - Add "Definition" button to the panel.
          //6 - Add "Color button to the panel.
          panel.add(pointButton);
           panel.add(clearButton);
            panel.add(lineButton);
             panel.add(quoteButton);
              panel.add(definitionButton);
               panel.add(colorButton);
          //END NORTHERN REGION
          
          frameArea = new JTextArea();
           frameArea.setLineWrap(true);
            frameArea.setWrapStyleWord(true);
             frameArea.setEditable(false);
          //END CENTRAL REGION
            
          //Components on the southern region of the frame.        
          //1 - Set the text field.
          frameEnter = new JTextField();
          //END SOUTHERN REGION
          
          
         contentPane.setLayout(new BorderLayout());
         contentPane.add(panel, BorderLayout.NORTH);
         contentPane.add(frameArea, BorderLayout.CENTER);
         contentPane.add(frameEnter, BorderLayout.SOUTH);
         //END REGION PLACEMENT
         
     }
    
   
     private void addListeners()
     {
         pointButton.addActionListener(this);
          clearButton.addActionListener(this);
           colorButton.addActionListener(this);
            quoteButton.addActionListener(this);
             definitionButton.addActionListener(this);
              lineButton.addActionListener(this);
               frameEnter.addActionListener(this);
     }
     //END ADDLISTENERS METHOD
     
     @Override
     public void actionPerformed(ActionEvent event)
     {
         String command = event.getActionCommand();
         
         if(event.getSource() instanceof JTextField)
         {
             frameEnter.setText(" ");
         }
         
         else if (command.equalsIgnoreCase("point"))
         {
            frameArea.append(Random.randomPointFor8P() + "\n" +"\n");
         }
         
          else if (command.equalsIgnoreCase("color"))
         {
             frameArea.setBackground(Random.color());
         }
         
          else if (command.equalsIgnoreCase("line"))
         {
             frameArea.append(Random.randomLineFor8P() + "\n" + "\n");
         }
         
          else if (command.equalsIgnoreCase("quote"))
         {
             frameArea.append(Random.quote() +"\n" + "\n");
         }
          
          else if (command.equalsIgnoreCase("definition"))
         {
             frameArea.append(Random.definition() + "\n" + "\n");
         }
         
          else if (command.equalsIgnoreCase("clear"))
         {
             frameArea.setText(" ");
         }
     }
 }
 
