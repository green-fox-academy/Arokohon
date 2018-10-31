import java.util.Scanner;

public class PartyIndicator {

    public static void main(String[] args) {

        System.out.println("Type in the number of girls!");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();

        System.out.println("Type in the number of boys!");
        Scanner scanner2 = new Scanner(System.in);
        int b = scanner2.nextInt();

        if ((a + b) >= 20 && a == b ){
            System.out.println("The party is excellent!");
        }
        if ((a + b) >= 20 && (a < b || a > b)){
            System.out.println("Quite cool party!");
        }
        if ((a + b) < 20 && a > 0){
            System.out.println("Average party.");
        }
        if (a == 0){
            System.out.println("Mehh... Sausage party.");
        }

    }
}
