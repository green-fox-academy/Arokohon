import java.util.Scanner;


public class GuessTheNumber {

    public static void main(String[] args) {

        int number = (int)(Math.random() * 101);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number between 0 - 100!");
        int guess = scanner.nextInt();

        while (guess != number){
            if (guess < number){
                System.out.println("The number is higher!");
            }
            if (guess > number){
                System.out.println("The number is lower!");
            }
            guess = scanner.nextInt();
        }
        System.out.println("You found the number: " + number);

    }
}
