/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import frames.KFrame7;
import javax.swing.SwingUtilities;

/**
 *
 * @author Sean
 */
public class GUI7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new ThreadForGUI());
    }

    private static class ThreadForGUI implements Runnable {

        @Override
        public void run() {
            GUI7 gui = new GUI7();
        }
    }

    public GUI7() {
        KFrame7 frame = new KFrame7("GUI 7");
    }

}
