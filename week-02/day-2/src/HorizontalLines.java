import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a 50 long horizontal line from that point.
        // Draw 3 lines with that function. Use loop for that.

//        for (int i = 0; i < 3; i++){
//
//            int x1 = (int) (Math.random() * 271);
//            int y1 = (int) (Math.random() * 271);
//            graphics.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
//            graphics.drawLine(x1, y1, x1 + 50, y1);
//        }

        for (int i = 0; i < 3; i++){

            drawing((int) (Math.random() * 271), (int) (Math.random() * 271), graphics);
        }
    }

    public static void drawing (int input1, int input2, Graphics graphics){

        graphics.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
        graphics.drawLine(input1, input2, input1 + 50, input2);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}