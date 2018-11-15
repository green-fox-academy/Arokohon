import java.util.Scanner;

public class Bunny2 {

  public static void main(String[] args) {
    System.out.println(recFunc(numScanner()));
  }

  public static int recFunc(int n) {
    if (n == 0) {
      return 0;
    }
    else if (n % 2 > 0) {
      return 2 + recFunc(n - 1);
    }
    return 3 + recFunc(n - 1);
  }

  public static int numScanner() {
    System.out.println("Type in a whole positive number!");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    return num;
  }
}
