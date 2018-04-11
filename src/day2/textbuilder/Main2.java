package day2.textbuilder;

import java.util.StringTokenizer;

public class Main2 {

    public static void main(String[] args) {
        String str = "Naucz się programować od podstaw i rozwiń wymarzoną karierę w branży IT.";

        String[] part = str.split(" ");
        for (String p : part) {
            System.out.println(p);
        }
        System.out.println("--------------------");
        
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }

    }

}
