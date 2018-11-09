import javax.swing.*;
import java.util.Scanner;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePLayQuarters {

    public static void mainDraw(Graphics graphics){
        System.out.println("Choose one of this number: 4/16/64!");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int quarters = (int)Math.sqrt(numbers);
        int width = 320 / numbers * quarters;
        int height = 320 / numbers * quarters;

        for (int a = 0; a < numbers / quarters; a++){
            for (int b = 0; b < numbers / quarters; b++){
                draw(a * width, b * height, width, height, graphics);
            }
        }
    }

    public static void draw (int inputx, int inputy, int inputw, int inputh, Graphics graphics){
        int drawIntensity = 20;
        for (int i = 0; i < drawIntensity; i++){
            int startx = inputx + 0;
            int starty = inputy + inputh/drawIntensity*i;
            int endx = inputx + inputh/drawIntensity*i;
            int endy = inputy+ inputh;
            graphics.setColor(Color.GREEN);
            graphics.drawLine(startx, starty, endx, endy);
            startx += inputw;
            starty = inputy + inputh - inputh/drawIntensity*i;
            endx = startx - inputw/drawIntensity*i;
            endy = inputy;
            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(startx, starty, endx, endy);
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