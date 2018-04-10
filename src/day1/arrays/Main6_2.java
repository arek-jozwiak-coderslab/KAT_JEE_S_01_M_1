package day1.arrays;

public class Main6_2 {

    public static void main(String[] args) {

        int[] mainTab = new int[50];
        for (int i = 0; i <= 49; i++) {
            mainTab[i] = i;
        }

        for (int i = 0; i < mainTab.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            String formatted = String.format("%02d", mainTab[i]);
            System.out.print(formatted + ", ");
        }

    }

}
