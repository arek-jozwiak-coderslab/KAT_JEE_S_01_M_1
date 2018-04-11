package day2.textbuilder;

import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {
        String text = "Java-zadania-podzial-napisow";
        text.toUpperCase();
        String[] returnFromMethod = onlyTwoElements(text, '-');
        System.out.println(Arrays.toString(returnFromMethod));
        day2.text.Main1.main(args);
        Main1.main(args);
    }
    
    static String[] onlyTwoElements(String str, char separator) { 
        return str.split(Character.toString(separator), 2);
    }

}
