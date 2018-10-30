public class PrintParams {

    public static void main(String[] args) {

        String[] szavak = {"egy", "kettő", "három"};
        printParams(szavak);
        
//        printParams("first", "second", "third");

    }

    public static void printParams(String... input){

        for (int i = 0; i < input.length; i++){
            System.out.println(input[i]);
        }



    }
}
