public class Reverse {

    public static void main(String[] args) {

        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        StringBuilder reReversed = new StringBuilder(reversed);
        reReversed.reverse();
        reversed = reReversed.toString();
        System.out.println(reversed);

    }

}
