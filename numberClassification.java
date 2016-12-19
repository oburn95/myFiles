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

     
         
         //Create an array to hold the 25 random nunmbers, 0 - 24.
          int[] randomNumbers = new int[25];
          
          //Create a random nunmber generator.
          Random random = new Random();
          
          for(int i = 0; i < randomNumbers.length; i++)
          {
             int n = random.nextInt(900) + 100;
             randomNumbers[i] = n;
          }
                  
         System.out.println("The numbers: ");
         printNumbers(randomNumbers);
         
         System.out.println("\n");
         System.out.println("These numbers are exclusively odd: ");
         exclusiveOdd(randomNumbers);
         
         System.out.println("\n");
         System.out.println("These numbers are exclusively even: ");
         exclusiveEven(randomNumbers);
         
         System.out.println("\n");
         System.out.println("These numbers are neither all odd, or all even: ");
         mixedDigit(randomNumbers);
         
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
     
      private static void exclusiveOdd(int[] array2)
      {
     
          for(int j = 0; j < array2.length; j++)
         { 
             int number = array2[j];
             
             int hundreds = number % 10;
             
             int tens = number / 10 % 10;
             
             int ones = number / 100 % 10;
             
             if(ones % 2 != 0 && tens % 2 != 0 && hundreds % 2 != 0) 
             System.out.print(number + " ");
             
             else; 
          }
      }
      
     private static void exclusiveEven(int[] array3)
     {
         for(int k = 0; k < array3.length; k++)
        { 
            int number = array3[k];
            int hundreds = number % 10;
            int tens = number / 10 % 10;
            int ones = number / 100 % 10;
            
            if(ones % 2 == 0 && tens % 2 == 0 && hundreds % 2 == 0) 
            System.out.print(number + " ");
            
            else; 
         }
     }
     
     private static void mixedDigit(int[] array4)
     {
         for(int l = 0; l < array4.length; l++)
         {
             int number = array4[l];
             int hundreds = number % 10;
             int tens = number / 10 % 10;
             int ones = number / 100 % 10;
             
           
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
             
             if((ones == tens) || (ones == hundreds) || (tens == hundreds))
             {
                 System.out.print(number + " ");
             }
             else;
         }
     }
     
 }
 
