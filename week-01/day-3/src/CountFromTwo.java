import java.util.Scanner;

public class CountFromTwo {

    public static void main(String[] args) {

        System.out.println("Type in a whole number please!");
        Scanner scannerA = new Scanner(System.in);
        int a = scannerA.nextInt();

        System.out.println("Type in a second whole number please!");
        Scanner scannerB = new Scanner(System.in);
        int b = scannerB.nextInt();

        if (a > b){
            System.out.println("The second number should be bigger!");
        }
        for (int i = a; i <= b; i++){
            System.out.println(i);
        }

    }
}
