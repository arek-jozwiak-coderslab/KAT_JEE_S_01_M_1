package day4.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main6 {

    public static void main(String[] args) {
        try {
            createDirectory("dir1");
            createDirectory("dir2");
            createDirectory("dir2");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    static void createDirectory(String fileName) throws IOException {
        //towrzę obiekt klasy Path przy pomocy statycznej metody get kalsy Paths
        Path p = Paths.get(fileName);
        //jeżeli nie istnieje katalog
        if (!Files.exists(p)) {
            //utwórz katatalog
            Files.createDirectory(p);
        }
    }

}
