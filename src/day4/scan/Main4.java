package day4.scan;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        getData();
    }

    static void getData() {
        int sum = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Nieprawidłowe dane");
            }
            int age = scanner.nextInt();
            if (age == 0) {
                break;
            }
            sum +=age;
            count++;
        }
        System.out.println("suma = " + sum + ", counter = " + count);
    }

}
