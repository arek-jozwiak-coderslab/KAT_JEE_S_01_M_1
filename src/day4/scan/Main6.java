package day4.scan;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        try {
            setData();
            getData();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    static void getData() throws IOException {
        Path file = Paths.get("plik1.txt");
        // dla wszystkich lini w pliku
        List<String> lines = Files.readAllLines(file);
        // tablicę intów o rozmiarze równym ilośći linie
        int[] elements = new int[lines.size()];
        // tworzymy zmienną pomocniczą
        int counter = 0;
        // wypełniamy tablisę elementami zpliku
        for (String s : Files.readAllLines(file)) {
            elements[counter] = Integer.parseInt(s);
            counter++;
        }
        // tworzymy sumę
        int sum = 0;
        // iterujemy po elementach tablicy
        for (int i = 0; i < elements.length; i++) {
            // jeżeli nieparzysty to sumujemy
            if ((i + 1) % 2 != 0) {
                sum += elements[i];
            }
        }
        System.out.println(sum);

    }

    static void setData() throws IOException {
        Path file = Paths.get("plik1.txt");
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.next();
            if (text.equals("quit")) {
                break;
            }
            try {
                int el = Integer.parseInt(text);
                list.add(el + "");
            } catch (Exception ex) {

            }

        }
        Files.write(file, list);
    }

}
