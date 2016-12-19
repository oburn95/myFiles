/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import frames.KFrame8;
import javax.swing.SwingUtilities;

/**
 *
 * @author Sean
 */
public class GUI8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new ThreadForGUI());
    }

    private static class ThreadForGUI implements Runnable {

        @Override
        public void run() {
            GUI8 gui = new GUI8();
        }
    }

    public GUI8() {
        KFrame8 frame = new KFrame8("GUI 8");
    }

}
