import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

    public static void mainDraw(Graphics graphics){
        for (int i = 0; i <= 160; i += 10) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(160, i, 160 - i, 160);
        }
        for (int j = 0; j <= 160; j += 10) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(320 - j, 160, 160,160 - j);
        }
        for (int k = 0; k <= 160; k += 10) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(160, 320 - k, 160 + k, 160);
        }
        for (int l = 0; l <= 160; l += 10) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(l, 160, 160, 160 + l);
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