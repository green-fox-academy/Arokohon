import javax.swing.*;
import java.util.Scanner;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {
    public static void mainDraw(Graphics graphics) {
        // Draw the canvas' diagonals.
        // If it starts from the upper-left corner it should be green, otherwise it should be red.

        graphics.setColor(Color.GREEN);
        graphics.drawLine(0, 0, 320, 320);

        graphics.setColor(Color.RED);
        graphics.drawLine(0, 320, 320, 0);

//        Doesn't working correctly yet - Don't know why, need to be found out!
//        System.out.println("Type in a starting point from one of these: Top left/Top right/Bottom left/Bottom right!");
//        Scanner scanner = new Scanner(System.in);
//        String start = scanner.next();
//
//        if (start == "Top left"){
//            graphics.setColor(Color.GREEN);
//            graphics.drawLine(0, 0, 320, 320);
//            graphics.setColor(Color.RED);
//            graphics.drawLine(0, 320, 320, 0);
//        } else {
//            graphics.setColor(Color.RED);
//            graphics.drawLine(320, 320, 0, 0);
//            graphics.setColor(Color.RED);
//            graphics.drawLine(0, 320, 320, 0);
//        }

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