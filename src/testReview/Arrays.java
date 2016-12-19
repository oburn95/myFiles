/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testReview;

import java.sql.Array;
import utilities.Random;

/**
 *
 * @author Sean
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] words = new String[2];

        String first = words[0];
        String last = words[words.length - 1];
     
        for (int i = 0; i < words.length/2; i++) {
            
            String temp = "";
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
            System.out.println(temp);
        }
    }

    private String letterSequence(int n) {
        String s = "";
        for (int i = 1; i <= n; i++) {
            s = s + " " + randomLetter();

        }
        return s.substring(1);

    }

    private String randomLetter() {
        String letters = "CDEFG";
        Random rgen = new Random();
        int rn = (int) (Math.random() * 5);
        return letters.substring(rn, rn + 1);
    }

}
