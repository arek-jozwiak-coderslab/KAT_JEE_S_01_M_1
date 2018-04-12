package day4.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main5 {

    public static void main(String[] args) {
        Path path1 = Paths.get("readFile.txt");
        try {
            for (String line : Files.readAllLines(path1)) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
