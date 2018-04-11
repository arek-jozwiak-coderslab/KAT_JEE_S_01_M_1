package day4.scan;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        getInfo();
    }

    static void getInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Poda imie");
        String name = scanner.nextLine();
        System.out.println("Podaj wiek");

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Nieprawidłowe dane");
        }
        int age = scanner.nextInt();
        System.out.println(name + " ma " + age + " lat.");
    }

}
