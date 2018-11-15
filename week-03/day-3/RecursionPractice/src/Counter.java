import java.util.Scanner;

public class Counter {

  public static void main(String[] args) {

    recFunc(numScanner());
  }

  public static int recFunc (int startNum) {

    if (startNum >= 0) {
      recFunc(startNum - 1);
      System.out.println(startNum);
    }
    return startNum;
  }


  public static int numScanner () {

    System.out.println("Type in a whole positive number!");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    return num;
  }
}
