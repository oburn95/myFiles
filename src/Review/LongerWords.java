/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Review;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class LongerWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Sentence? ");
        String word = kb.nextLine()+" ";
        String[] wordArray = word.split(" ");
         int totalAmount=0;
         int average=0;
         
        for (int i = 0; i < wordArray.length; i++) {
          totalAmount = totalAmount + wordArray[i].length();
        }
        average=totalAmount/wordArray.length;
        System.out.println("the longer words...");
        for (int i = 0; i < wordArray.length; i++) {
            if(average <wordArray[i].length()){
                System.out.print(wordArray[i]+"\n");
            }
            
        }
        
    }
    
}
