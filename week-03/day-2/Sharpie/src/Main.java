public class Main {
    public static void main(String[] args) {
        Sharpie sharpie1 = new Sharpie("blue", (float)40);
        sharpie1.useSharpie();
        sharpie1.useSharpie();
        sharpie1.useSharpie();
        sharpie1.useSharpie();
        sharpie1.useSharpie();
        sharpie1.useSharpie();
        System.out.println(sharpie1.inkAmount);
    }
}
