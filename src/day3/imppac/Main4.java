package day3.imppac;

import javax.swing.JOptionPane;

public class Main4 {

    public static void main(String[] args) {
        int[] tab = { 5, 1, 6, 7, 8 };

        try {
            System.out.println(tab[55555]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();

        }

    }

}
