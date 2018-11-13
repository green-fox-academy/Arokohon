public class Main {
    public static void main(String[] args) {
        Counter num1 = new Counter();
        num1.add(15);
        num1.add();
        num1.add();
        num1.add(10);
        num1.add();
        num1.add(30);
        num1.reset();
        num1.add();
        num1.get();
    }
}
