import java.util.Scanner;

public class OneTwoALot {

    public static void main(String[] args) {

        System.out.println("Type a whole number!");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a <= 0){
            System.out.println("Not enough!");
        }
        else if (a == 1){
            System.out.println("One");
        }
        else if (a == 2){
            System.out.println("Two");
        }
        else {
            System.out.println("It's a lot!");
        }

    }
}
