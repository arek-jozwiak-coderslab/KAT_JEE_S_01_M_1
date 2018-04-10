package day1.arrays;

public class Main1 {

    public static void main(String[] args) {

        int[] myNumbers = new int[3];
        myNumbers[0] = 120;
        myNumbers[1] = 3;
        myNumbers[2] = 45;

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(myNumbers[i]);
        }

        int numbers[] = { 120, 3, 45 };

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

}
