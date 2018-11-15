import java.util.Scanner;

public class Power {

  public static void main(String[] args) {
    System.out.println(recFunc(baseNumScanner(), numScanner()));
  }

  public static int recFunc(int base, int n) {
    if (n == 0) {
      return 1;
    }
    return base * recFunc(base, n - 1);
  }


  public static int baseNumScanner() {
    System.out.println("Type in a whole positive number!");
    Scanner scanner = new Scanner(System.in);
    int baseNum = scanner.nextInt();

    return baseNum;
  }

  public static int numScanner() {
    System.out.println("Type in a whole positive number!");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    return num;
  }
}
