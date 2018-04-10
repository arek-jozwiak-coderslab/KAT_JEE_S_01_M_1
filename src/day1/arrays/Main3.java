package day1.arrays;

public class Main3 {

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4};
        int[] copyTab = tab;
        tab[3] = 10;
        System.out.println(copyTab[3]);

    }

}
