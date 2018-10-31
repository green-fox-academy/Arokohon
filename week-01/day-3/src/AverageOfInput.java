import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Give me 5 numbers!");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        System.out.println("The total values is: " + sumNumbers(numbers) + ".");
        System.out.println("The average is: " + (sumNumbers(numbers) / numbers.length) + ".");

    }

    public static int sumNumbers (int[] numbers){

        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        return sum;
    }
}
