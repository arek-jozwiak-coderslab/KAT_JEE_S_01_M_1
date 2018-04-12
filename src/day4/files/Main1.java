package day4.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main1 {

    public static void doSome() throws FileNotFoundException {
        File file = new File("readFile.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
    }

    public static void main(String[] args) {
        try {
            doSome();
        } catch (FileNotFoundException e) {
  
            e.printStackTrace();
        }
    }

}
