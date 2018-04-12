package day4.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main4 {

    public static void main(String[] args) {
//        Path p = Paths.get("/home/dell/index.html");
//       System.out.println(p.getFileName());
       Path path1 = Paths.get("path1.txt");
       Path path2 = Paths.get("path2.txt");
       try {
           Files.copy(path1, path2);
       } catch (IOException e) {
           e.printStackTrace();
       }

    }

}
