/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author Sean
 */
public class Random {
   
  static public Color color()
      {
          int redValue = (int)(Math.random() * 256);
          int greenValue = (int)(Math.random() * 256);
          int blueValue = (int)(Math.random() * 256);
          return new Color(redValue, greenValue, blueValue);
      }
      
      public static Point point(int x, int y)
      {
          int a = number(x);
          int b = number(y);
          return new Point(a,b);
      }
      
      private static int number(int x)
      {
          return (int) Math.random() * x;
      }
      
      //Finds a random point for the GUI8P assignment.
      public static String randomPointFor8P()
      {
          int lattitude, longitude;
          
          //Lattitude = random number, 0 =< x => 1 multiplied by 500.
          lattitude = (int) (500 * Math.random());
          //Longitude = random number, 0 =< y >= 1 multiplied by 600.
          longitude = (int) (600 * Math.random());
          String aPoint = "(" + lattitude + ")" + ", " + "(" + longitude + ")";
          return aPoint;
      }
      
      //Finds a random line for the GUI8P assignment.
      public static String randomLineFor8P()
      {
          String line = ("Line Points: " + randomPointFor8P() + ". ");
          int degree =  (int) (Math.random() * 359);
          return (line + degree +" degrees");
      }
      
      //Clear method for the 8P assignment.
      public static String clear()
      {
          String empty = " ";
          return empty;
      }
      
      //Quote bank for 8P assignment.
      public static String quote()
      {
          //Create a string array.
          String[] quotes = new String[10];
          //Populate the array with delectable quotes.
          quotes[0] = " Always forgive your enemies; nothing "
                  + "annoys them so much [Oscar Wilde]";
          quotes[1] = "All I can do is be me, whoever that is [Bob Dylan]";
          quotes[2] = "no man has a good enough memory to be a successful "
                  + "liar [Abraham Lincoln]";
          quotes[3] = "Life is about making an impact, not an income "
                  + "[Kevin Kruse]";
          quotes[4] = "Two things are infinite: the universe and human stupidity;  "
                  + "and I'm not sure about the universe [Albert Einstein]";
          quotes[5] = "Eighty percent of success is showing up [Woody Allen]";
          quotes[6] = "The good times of today are the sad thoughts of tomorrow"
                  + " [Bob Marley]";
          quotes[7] = "If you tell the truth, you don't have to remember anything"
                  + " [Mark Twain]";
          quotes[8] = "Don't cry because it is over, smile because"
                  + " it happened [Dr. Seuss]";
          quotes[9] = "There is nothing either good or bad but thinking makes"
                  + "it so [William Shakespeare]";
          
          //Set an index as a random double 1 - 10 and typecast it into an integer 
          int randomIndex = (int) (Math.random() * 10);
          //Return the quote from the index at the random number
          return quotes[randomIndex];
      }
      
      //Definition bank for 8P assignment.
      public static String definition()
      {
          //Create a string array.
        String[] def = new String[10];
         //Populate the array with delectable quotes.
         def[0] = "Dog - Barks at houses";
         def[1] = "Doug - Underwater human";
         def[2] = "Fox - orange dog";
         def[3] = "Computer - A magic box";
         def[4] = "Cell phone - The reason you are failing life";
         def[5] = "Legos - I wish I was still 10";
         def[6] = "Mailman - enemy of said Dog";
         def[7] = "Interesting stories -Superman's weakness";
         def[8] = "Astrology - Not a real science persay";
         def[9] = "Briefcase - An important thing? a case?";
         
         //Set an index as a random double 1 - 10 and typecast it into an integer 
         int randomIndex = (int) (Math.random() * 10);
         //Return the definition from the index at the random number
         return def[randomIndex];
     }
}