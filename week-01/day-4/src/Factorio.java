public class Factorio {

    public static void main(String[] args) {

        System.out.println(factorio(6));

    }

    public static long factorio (int input){

        long result = 1;

        for (int factor = 2; factor <= input; factor++){
            result *= factor;
        }

        return result;
    }
}
