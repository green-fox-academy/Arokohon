import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        numLines("day-1.iml");
    }
    public static void numLines (String fileName){
        Path file = Paths.get(fileName);
        try {
            System.out.println(Files.lines(file).count());
        }
        catch (Exception e){
            System.out.println("0");
        }
    }
}