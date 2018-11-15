import java.util.Scanner;

public class SumDigit {

  public static void main(String[] args) {

    System.out.println(recFunc(numScanner()));
  }

  public static int recFunc (int startNum) {

    if (startNum < 1) {
      return 0;
    }
    return startNum % 10 + recFunc(startNum / 10);
  }


  public static int numScanner () {

    System.out.println("Type in a whole positive number!");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    return num;
  }
}
