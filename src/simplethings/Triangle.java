/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplethings;

/**
 *
 * @author Sean
 */
public class Triangle implements TriangleADT {

    double side1, side2, side3;

    public Triangle(double s) {   //this is for an equilateral triangle
        side1 = s;
        side2 = s;
        side3 = s;
    }

    public Triangle(double s1, double s2, double s3) { //this is for a right angle triangle
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    @Override
    //Hero's formula
    public double area() {
        double s = (side1 + side2 + side3) / 2.0d;
        double x = (s * (s - side1) * (s - side2) * (s - side3));
        double Area = Math.sqrt(x);
        return Area;

    }

    @Override
    public double perimeter() {
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }

    @Override
    public String toString() {
        return "<Triangle with A=" + side1 + " B=" + side2 + " C=" + side3 + ">";
    }

}
