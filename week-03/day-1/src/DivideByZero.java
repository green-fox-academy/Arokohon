import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a number!");
        try {
            int number = scanner.nextInt();
            System.out.println(10 / number);
        } catch (InputMismatchException a){
            System.out.println("Please type in a whole number!");
        } catch (ArithmeticException b){
            System.out.println("Fail, can't divide by zero!");
        }
    }
}
