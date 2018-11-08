import java.util.Scanner;

public class DrawDiamond {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a whole positive number!");
        int data = scanner.nextInt();

        draw(data);
    }

    public static void draw (int input){

        for (int i = 1; i <= input; i++) {
            for (int j = 0; j < input - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        int inverseLineNum = input - 1;
        for (int l = inverseLineNum; l >= 1; l--){
            for (int m = 1; m <= input - l; m++){
                System.out.print(" ");
            }
            for (int n = 1; n <= (l * 2) - 1; n++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
