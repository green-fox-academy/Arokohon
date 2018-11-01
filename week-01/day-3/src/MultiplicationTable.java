import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        System.out.println("Type a whole number please!");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 1;

        while (b <= 10){
            System.out.println(a * b);
            b++;
        }

    }
}
