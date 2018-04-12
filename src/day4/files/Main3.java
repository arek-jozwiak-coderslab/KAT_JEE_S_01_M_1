package day4.files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main3 {

    public static void doSome() throws IOException {
        // tworzymy obiekt
        FileWriter out = new FileWriter("writeFile.txt", true);
        System.out.println("Dopisz do pilku ile chcesz a quit dla wyjścia");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // pobieramy linie
            String line = scanner.nextLine();
            // jeżeli linia równa quit
            if (line.equals("quit")) {
                // wyskakujemy z while
                break;
            }
            // dopisujemy do pliku
            out.append(line).append("\n");
        }
        // zamykamy plik
        System.out.println("Koniec !!!");
        scanner.close();
        out.close();
    }

    public static void main(String args[]) {
        try {
            doSome();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
