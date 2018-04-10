package day1.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main7 {

    public static void main(String[] args) {
        int[] randNumbers = new int[20];
        Random r = new Random();
       
        
        for (int i = 0; i < randNumbers.length; i++) {
            randNumbers[i] = r.nextInt(101);
        }
        System.out.println(Arrays.toString(randNumbers));
        Arrays.sort(randNumbers);
        System.out.println(randNumbers[0]);
    }

}
