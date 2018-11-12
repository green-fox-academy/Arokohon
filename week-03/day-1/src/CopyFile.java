import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        String filePath1 = "C:/Users/Tamás/greenfox/Arokohon/week-03/my-file.txt";
        String filePath2 = "C:/Users/Tamás/greenfox/Arokohon/week-03/my-file2.txt";
        System.out.println(copyFile(filePath1, filePath2));
    }
    public static boolean copyFile (String filename1, String filename2){
        Path path1 = Paths.get(filename1);
        Path path2 = Paths.get(filename2);
        try {
            List<String>text = Files.readAllLines(path1);
            Files.write(path2, text, StandardOpenOption.APPEND);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
