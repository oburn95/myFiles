/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Review;

import utilities.Random;

/**
 *
 * @author Sean
 */
public class numberClassification {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
  /**
 13  *
 14  * @author Adam Horeth
 15  */
 
     
         
         //Create an array to hold the 25 random nunmbers, 0 - 24.
          int[] randomNumbers = new int[25];
          
          //Create a random nunmber generator.
          Random random = new Random();
          
          //Populate the array for all values i, where i is less than array length
          for(int i = 0; i < randomNumbers.length; i++)
          {
             int n = random.nextInt(900) + 100;
             randomNumbers[i] = n;
          }
                  
         //Print all random numbers on the screen.
         System.out.println("The numbers: ");
         printNumbers(randomNumbers);
         
         //Print numbers with 3 odd digits on the screen.
         System.out.println("\n");
         System.out.println("These numbers are exclusively odd: ");
         exclusiveOdd(randomNumbers);
         
         //Print numbers with 3 even digits on the screen.
         System.out.println("\n");
         System.out.println("These numbers are exclusively even: ");
         exclusiveEven(randomNumbers);
         
         //Print numbers with mixed digits on the screen.
         System.out.println("\n");
         System.out.println("These numbers are neither all odd, or all even: ");
         mixedDigit(randomNumbers);
         
         //Print numbers that have exactly 2 digits that are the same.
         System.out.println("\n");
         System.out.println("These numbers have two of the same digits: ");
         sameDigits(randomNumbers);
         System.out.println("\n");
      }
      
      //Method prints all numbers to the screen.
      private static void printNumbers(int[] array)
      {
          for(int i = 0; i < array.length; i++)
         {
             System.out.print(array[i] + " ");
         }
      }
     
      //Method prints only the numbers that have all odd digits to the screen.
      private static void exclusiveOdd(int[] array2)
      {
          //Note that the for loop is pretty much the same for all methods. The
          //only thing that changes is the logic used by the conditional.
          for(int j = 0; j < array2.length; j++)
         { 
             //Set a new int as the number at current array address.
             int number = array2[j];
             
             //Get the number in the 100s place.
             int hundreds = number % 10;
             
             //Get the number in the 10s place.
             int tens = number / 10 % 10;
             
             //Get the number in the ones place.
             int ones = number / 100 % 10;
             
             //if 1s and 10s and 100s % 2 don't equal zero, all digits are odd.
             if(ones % 2 != 0 && tens % 2 != 0 && hundreds % 2 != 0) 
             System.out.print(number + " ");
             
             else; 
          }
      }
      
     //Prints only numbers that have all even digits to the screen.
     private static void exclusiveEven(int[] array3)
     {
         for(int k = 0; k < array3.length; k++)
        { 
            int number = array3[k];
            int hundreds = number % 10;
            int tens = number / 10 % 10;
            int ones = number / 100 % 10;
            
            //if 1s and 10s and 100s % 2 = 0 all digits are even.
            if(ones % 2 == 0 && tens % 2 == 0 && hundreds % 2 == 0) 
            System.out.print(number + " ");
            
            else; 
         }
     }
     
     //Prints numbers that aren't exclusively odd or even.
     private static void mixedDigit(int[] array4)
     {
         for(int l = 0; l < array4.length; l++)
         {
             int number = array4[l];
             int hundreds = number % 10;
             int tens = number / 10 % 10;
             int ones = number / 100 % 10;
             
             //if 1s and 10s are even and 100s are odd -OR-
             //if 1s and 100s are even and 10s are odd -OR-
             //if 10s and 100s are even and 1s are odd, print the number.
             if((ones % 2 == 0 && tens % 2 == 0 && hundreds % 2 != 0) || 
                     (ones % 2 == 0 && tens % 2 != 0 && hundreds % 2 == 0) ||
                     (ones % 2 != 0 && tens % 2 == 0 && hundreds % 2 ==0))
                 System.out.print(number + " ");
             else;
         }
     }
     
     private static void sameDigits(int[] array5)
     {
         for(int m = 0; m < array5.length; m++)
         {
             int number = array5[m];
             int hundreds = number % 10;
             int tens = number /10 % 10;
             int ones = number / 100 % 10;
             
            //Print if 1s = 10s or 1s = 100s or 10s = 100s
             if((ones == tens) || (ones == hundreds) || (tens == hundreds))
             {
                 System.out.print(number + " ");
             }
             else;
         }
     }
     
 }
 
