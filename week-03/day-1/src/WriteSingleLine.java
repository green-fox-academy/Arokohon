import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        List<String> newLine = new ArrayList<>();
        newLine.add("Tamás Szőke");
        newLine.add("Péter");
        Path file = Paths.get("C:/Users/Tamás/greenfox/Arokohon/week-03/my-file.txt");
        try {
            Files.write(file, newLine, StandardOpenOption.APPEND);
        }catch (Exception e){
            System.out.println("Unable to write file: " + file);
        }

    }
}