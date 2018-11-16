import java.util.Scanner;

public class String3 {

  public static void main(String[] args) {
    String text = textScanner();
    int textLength = textLength(text);
    System.out.println(recFunc(text, textLength));
  }

  public static String recFunc(String text, int length) {
    if (length > 1) {
      text = text.substring(0, length - 1) + "*" + text.substring(length - 1);
      return recFunc(text, length - 1);
    }
    return text;
  }

  public static String textScanner() {
    System.out.println("Type in a random text!");
    Scanner scanner = new Scanner(System.in);
    String text = scanner.next();

    return text;
  }

  public static int textLength( String text) {
    int length = text.length();
    return length;
  }
}
