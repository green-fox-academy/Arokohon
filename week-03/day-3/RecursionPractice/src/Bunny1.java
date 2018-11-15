import java.util.Scanner;

public class Bunny1 {

  public static void main(String[] args) {
    System.out.println(recFunc(2, numScanner()));
  }

  public static int recFunc(int base, int n) {
    if (n == 0) {
      return 0;
    }
    return base + recFunc(base, n - 1);
  }

  public static int numScanner() {
    System.out.println("Type in a whole positive number!");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    return num;
  }
}
