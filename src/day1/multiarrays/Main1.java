package day1.multiarrays;

import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) {
        int[][] tab = { { 1, 3, 4 }, { 4, 5, 6 }, { 7, 8, 9 } };

        tab[0][0] = 11;
        int[] tmpTab = { 1, 24, 44 };
        tab[0] = tmpTab;

        System.out.println(tab[0][0]);
        System.out.println(tab[1][1]);
        System.out.println(tab[2][2]);
        System.out.println(Arrays.toString(tab[0]));
        
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.println(tab[i][j]);
            }
        }
        
        for (int i = 0; i < tab.length; i++) {
            System.out.println(Arrays.toString(tab[i]));
        }
    }

}
