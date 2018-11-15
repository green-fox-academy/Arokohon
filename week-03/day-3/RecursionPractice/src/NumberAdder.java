import java.util.Scanner;

public class NumberAdder {

  public static void main(String[] args) {

    recFunc(1, numScanner());
  }

  public static int recFunc (int startNum, int endNum) {

    if (startNum <= endNum) {
      recFunc(startNum + 1, endNum);
      System.out.println(startNum + endNum);
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
