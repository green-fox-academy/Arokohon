import java.util.Scanner;

public class DrawPyramid {

    public static void main(String[] args) {

        System.out.println("Type in a whole positive number!");
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();

        draw(level);
    }

    public static void draw (int input){

        for (int i = 1; i <= input; i++){
            for (int j = 0; j < input - i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) -1; k++){
                System.out.print("*");
            }
            System.out.println("");

        }

    }
}
