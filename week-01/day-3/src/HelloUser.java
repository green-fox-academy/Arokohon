import java.util.Scanner;

public class HelloUser
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name please!");
        String userName = input.nextLine();

        System.out.println("Hello " + userName + "!");




    }
}
