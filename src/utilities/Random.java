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
   
    static public Color color(){
        int rv =(int)(Math.random()*256);
        int gv = (int)(Math.random()*256);
        int bv = (int)(Math.random()*256);
        return new Color(rv,gv,bv);
    }
    
    public static Point point(int x, int y){
        int a = number(x*(int)Math.random()*500+1);
        int b = number(y*(int)Math.random()*600+1);
        return new Point(a,b);
        
    }
        
    private static int number(int x) {
        return (int) Math.random()*x;
    }
}
