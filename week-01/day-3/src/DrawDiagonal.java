import java.util.Scanner;

public class DrawDiagonal {

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
            for (int k = 0; k < j; k++){
                System.out.print(" ");
            }
            System.out.print("%");
            for (int l = lines - 3; l > j; l--){
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
