import java.util.Scanner;

public class Refactorio {

  public static void main(String[] args) {
    System.out.println(recFunc(numScanner()));
  }

  public static int recFunc (int num) {

    if (num < 2) {
      return num;
    }
    return num * recFunc(num - 1);
  }


  public static int numScanner () {

    System.out.println("Type in a whole positive number!");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    return num;
  }
}
