/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testers;

import simplethings.Triangle;

/**
 *
 * @author Sean
 */
public class TriangleTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangle edward = new Triangle(10);
        System.out.println(edward.toString());
        Triangle iris = new Triangle(3,4,5);
        System.out.println(iris.toString());
        System.out.println("perimeter of equilateral = " + edward.perimeter());
        System.out.println("perimeter of iris = " + iris.perimeter());
        System.out.println("area of equilateral = "+ edward.area());
        System.out.println("area of iris = " + iris.area());
    }
    
    
}
