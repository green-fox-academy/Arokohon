import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args) {

        System.out.println("Type  a whole number!");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();

        System.out.println("Type another whole number!");
        Scanner scanner2 = new Scanner(System.in);
        int b = scanner2.nextInt();

        if (a > b){
            System.out.println("The number " + a + " is the bigger.");
        }
        else {
            System.out.println("The number " + b + " is the bigger.");
        }

    }
}
