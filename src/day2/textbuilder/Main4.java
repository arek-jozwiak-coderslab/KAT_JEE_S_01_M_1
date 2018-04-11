package day2.textbuilder;

import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {
        String text = "Java-zadania-podzial-napisow";
        String[] returnFromMethod = onlyTwoElements(text, '-');
        System.out.println(Arrays.toString(returnFromMethod));

    }
    
    static String[] onlyTwoElements(String str, char separator) { 
        return str.split(Character.toString(separator), 2);
    }

}
