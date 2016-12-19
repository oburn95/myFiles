/*
 Making a program to prompt the user for a sentence then read through 
 sentence to pick out the longest string of characters
 */
package Review;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class LongestWord {

    /**
     * @param args the command line arguments
     */
    public static String findLongestWord() {
        Scanner kb = new Scanner(System.in);
                String word = "";
        int maxlength = 0;
        System.out.print("Sentence? ");
        String str = kb.nextLine();
        String maxword = "";
        str = str + ' ';

        
        
        for (int i = 0; i < str.length(); i++) {
            word = word + str.charAt(i);
            if (str.charAt(i + 1) == ' ') {
                if (word.length() > maxlength) {
                    maxword = new String(word);
                    maxlength = word.length();
                }
                word = "";
                i++;
            }
        }
        System.out.println("longest word: " + maxword);
        return "";
    }

    public static void main(String[] args) {
        findLongestWord();

    }
}
