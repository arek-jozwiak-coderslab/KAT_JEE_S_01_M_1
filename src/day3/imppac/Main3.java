package day3.imppac;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main3 {
    
    static void met1() throws FileNotFoundException{
        File file = new File("readFile.txt");
        Scanner scan = new Scanner(file);
    }
    static void met2() throws FileNotFoundException{
        File file = new File("readFile.txt");
        Scanner scan = new Scanner(file);
    }
     static void met3() throws FileNotFoundException{
        File file = new File("readFile.txt");
        Scanner scan = new Scanner(file);
    }

    public static void main(String[] args){
        try {
            met1();
            met2();
            met3();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
