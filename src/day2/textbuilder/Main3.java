package day2.textbuilder;

import java.util.Arrays;

public class Main3 {

    public static void main(String[] args) {
        String text = "Java-zadania-podzial-napisow";
        String[] returnFromMethod = onlyTwoElements(text, '-');
        System.out.println(Arrays.toString(returnFromMethod));
    }

    static String[] onlyTwoElements(String str, char separator) {
        String[] parts = str.split(Character.toString(separator));
        String[] returnParts = new String[2];
        returnParts[0] = parts[0];
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < parts.length; i++) {
            builder.append(parts[i]).append("-");
        }
        String secondPart = builder.toString();
        String secondPArtSubstring = secondPart.substring(0, secondPart.length() - 1);
        returnParts[1] = secondPArtSubstring;
        return returnParts;
    }

}
