import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        Path file = Paths.get("day-1.iml");
        try {
            List<String> lines = Files.readAllLines(file);
            for (String l:lines
                 ) {
                System.out.println(l);
            }
        }catch (IOException a){
            System.out.println("Sry, file doesn't exist.");
        }
    }
}