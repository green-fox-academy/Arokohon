import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the number of desired lines!");
        int numLines = scanner.nextInt();
        writingFunction("C:/Users/Tamás/greenfox/Arokohon/week-03/my-file.txt", "Greenfox", numLines);
    }
    public static void writingFunction (String path, String word, int number){
        try {
            Path file = Paths.get(path);
            List<String> text = new ArrayList<>();
            text.add(word);
            for (int i = 0; i < number; i++){
                Files.write(file, text, StandardOpenOption.APPEND);
            }
        }catch (Exception e){
            System.out.println("There is no error here, please move away! :)");
        }
    }
}                                                                                        