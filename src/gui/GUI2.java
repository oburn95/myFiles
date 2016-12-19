/*
 same as GUI 1 except for the addition of a frame class
 */
package gui;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Sean
 */
public class GUI2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new ThreadForGUI());
    }

    private static class ThreadForGUI implements Runnable {

        @Override
        public void run() {
            GUI2 gui = new GUI2();
        }

    }

    public GUI2() {
        KFrame frame = new KFrame("GUI 2");
    }

    private class KFrame extends JFrame {

        public KFrame(String title) {
            super(title);
            setSize(500, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }

    }

}
