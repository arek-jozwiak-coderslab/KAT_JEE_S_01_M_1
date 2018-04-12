package day4.files;

import java.io.FileWriter;
import java.io.IOException;

public class Main2 {

    public static void main(String[] args) {
        FileWriter out;
        try {
             out = new FileWriter("writeFile.txt", true);
            out.append("first line\n");
            out.append("second line\n");
            out.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
