package day1.arrays;

import java.util.Arrays;

public class Main6 {

    public static void main(String[] args) {
        int[] mainTab = new int[50];
        for (int i = 0; i <= 49; i++) {
            mainTab[i] = i;
        }

        for (int i = 0; i < mainTab.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            String padding = "";
            if (mainTab[i] < 10) {
                padding = "0";
            }
            System.out.print(padding+mainTab[i] + ", ");
        }

    }

}
