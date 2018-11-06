public class TakesLonger {

    public static void main(String[] args) {

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        System.out.println(quote.indexOf("you"));
        String quoteSeparate1 = quote.substring(0, 20);
        String quoteSeparate2 = quote.substring(quote.indexOf("you"));

//        System.out.println(quoteSeparate1);
//        System.out.println(quoteSeparate2);

        quote = quoteSeparate1 + " always takes longer than " + quoteSeparate2;
        System.out.println(quote);
    }
}
