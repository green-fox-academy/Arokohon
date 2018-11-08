import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

//       int x = (int) (Math.random() * 161);
//       int y = (int) (Math.random() * 161);
//       draw(x, y, graphics);

        int x = 0;
        int y = 0;
        draw(x, y, graphics);
    }

//    public static void draw (int input1, int input2, Graphics graphics){
//
//        graphics.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
//        for (int i = input1; i <= 320 - input1; i += 20){
//            for (int j = input2; j <= 320 - input2; j += 20){
//                graphics.drawLine(i, j, 160, 160);
//            }
//        }
//    }

    public static void draw (int input1, int input2, Graphics graphics){

        graphics.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
        for (int i = input1; i <= 320 - input1; i += 20){
            graphics.drawLine(i, 0, 160, 160);
            graphics.drawLine(i, 320, 160, 160);
        }
        for (int j = input2; j <= 320 - input2; j += 20){
            graphics.drawLine(0, j, 160, 160);
            graphics.drawLine(320, j, 160, 160);
        }
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