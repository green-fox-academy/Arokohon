public class String1 {

  public static void main(String[] args) {
    System.out.println(recFunc("xiaomixiaomixylophonex"));
  }

  public static String recFunc(String text) {
    if (text.contains("x")) {
      return recFunc(text.replaceFirst("x", "y"));
    }
    return text;
  }
}
