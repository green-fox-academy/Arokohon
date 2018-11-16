import java.util.Scanner;

public class Fibonacci {

  public static void main(String[] args) {
    System.out.println(recFunc(numScanner()));
  }

  public static int recFunc (int fibNum) {

    if (fibNum < 2) {
      return fibNum;
    }
    return recFunc(fibNum - 1) + recFunc(fibNum - 2);
  }


  public static int numScanner () {

    System.out.println("Type in a whole positive number!");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    return num;
  }
}
