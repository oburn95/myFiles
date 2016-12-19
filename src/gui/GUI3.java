/*
 creates a frame that has buttons that serve no real function besides aestetic
 */
package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Sean
 */
public class GUI3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new ThreadForGUI());
    }

    private static class ThreadForGUI implements Runnable {

        @Override
        public void run() {
            GUI3 gui = new GUI3();
        }
    }

    public GUI3() {
        KFrame frame = new KFrame("GUI 3");
    }

    public class KFrame extends JFrame {

        private JButton blueButton;
        private JButton redButton;
        private JButton greenButton;
        private JButton yellowButton;
        private JLabel colorLabel;

        public KFrame(String title) {
            super(title);
            setSize(500, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            addComponents(getContentPane());
            setVisible(true);

        }

        private void addComponents(Container contentPane) {
            blueButton = new JButton("Blue");
            redButton = new JButton("Red");
            greenButton = new JButton("Green");
            yellowButton = new JButton("Yellow");
            colorLabel = new JLabel("press a button ...");
            contentPane.setLayout(new FlowLayout());
            contentPane.add(blueButton);
            contentPane.add(redButton);
            contentPane.add(greenButton);
            contentPane.add(yellowButton);
            contentPane.add(colorLabel);
        }
    }
}
