public class Main {
    public static void main(String[] args) {
        Animal cheetah = new Animal();
        cheetah.play();
        cheetah.play();
        cheetah.play();
        cheetah.eat();
        cheetah.eat();
        cheetah.drink();
        System.out.println(cheetah.hunger);
        System.out.println(cheetah.thirst);
    }
}
