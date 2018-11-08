import java.util.Scanner;

public class DrawTriangle {

    public static void main(String[] args) {

        System.out.println("Type in a whole number!");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String star = "*";
        String starInc = "*";

        for (int i = 0; i < a; i++){
            System.out.println(star);
            star = star + starInc;
            }
        }

    }

