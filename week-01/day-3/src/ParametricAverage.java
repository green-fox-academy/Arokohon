import java.util.Scanner;

public class ParametricAverage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the numbers of the elements!");
        double number = scanner.nextInt();
        double sumNumbers = 0;

        for (int i = 0; i < number; i++){
            System.out.println("Type in the elements!");
            double element = scanner.nextInt();
            sumNumbers += element;
        }

        double average = sumNumbers / number;

        System.out.println("The sum of the elements is: " + (int) sumNumbers);
        System.out.println("The average of the elements is: " + average);
    }
}
