import java.util.Scanner;

public class MileToKmConverter {

    public static void main(String[] args) {

        System.out.println("Add a distance in km please!");

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        
        System.out.println("The distance in miles: " + (userInput * 0.62) + ".");
    }
}
