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
public class CollatzSequence {

      static Scanner MyScanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("The positive integer? ");

        int num = MyScanner.nextInt();
        int counter = 1;
        while (num > 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = (num * 3) + 1;
             }
           System.out.print(num + " ");
           counter = counter +1;
           if((counter % 10)==0){System.out.println();}
        }
        if ((counter % 10)!=0){System.out.println();}

    }
}