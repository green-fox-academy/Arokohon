import java.util.Scanner;

public class AnimalsAndLegs {

    public static void main(String[] args) {

        System.out.println("Number of chickens:");

        Scanner scanner1 = new Scanner(System.in);
        int userInput1 = scanner1.nextInt();

        System.out.println("Number of pigs:");
        Scanner scanner2 = new Scanner(System.in);
        int userInput2 = scanner2.nextInt();

        System.out.println("Number of legs: " + ((userInput1 * 2) + (userInput2 * 4)) + ".");

    }
}
