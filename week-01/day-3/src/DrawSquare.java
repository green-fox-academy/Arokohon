import java.util.Scanner;

public class DrawSquare {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a whole positive number!");
        int lines = scanner.nextInt();

        for (int i = 0; i < lines; i++){
            System.out.print("%");
        }
        System.out.println("");

        for (int j = 0; j < lines - 2; j++) {
            System.out.print("%");
            for (int k = 0; k < lines - 2; k++){
                System.out.print(" ");
            }
            System.out.print("%");
            System.out.println();
        }

        for (int i = 0; i < lines; i++){
            System.out.print("%");
        }
    }
}
