/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testers;

import simplethings.Name;

/**
 *
 * @author Sean
 */
public class NameTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Name n = new Name("Cleo", "White");
        System.out.println("First name = " + n.first());
        System.out.println("Last name = " + n.last());
        System.out.println("Natural name = " + n.natural());
        System.out.println("Formal name = " + n.formal());
        if (n.check("C", "W")) {
            System.out.println("Initials of " + n.natural() + " are " + "CW");
        } else {
            System.out.println("Initials of " + n.natural() + " are not " + "CW");
        }
        if (n.check("W", "C")) {
            System.out.println("Initials of " + n.natural() + " are " + "WC");

        } else {
            System.out.println("Initials of " + n.natural() + " are not " + "WC");
        }
    }

}
