package day2.text;

import java.util.Arrays;

public class Main3 {

    public static void main(String[] args) {

        System.out.println(toogleChar("Tak"));
    }

    public static String toogleChar(String str) {
        char[] tmpStr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                tmpStr[i] = Character.toLowerCase(str.charAt(i));
            } else {
                tmpStr[i] =Character.toUpperCase(str.charAt(i));
            }
       

        }

        return String.valueOf(tmpStr);
    }

}
