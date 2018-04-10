package day2.text;

public class Main2 {

    public static void main(String[] args) {
        String str = "CodersLab jak dobrze zacząć programować";
        char beforeLast = str.charAt(str.length() - 2);
        System.out.println(beforeLast);

        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == beforeLast) {
                counter++;
            }
        }

        int counter2 = 0;
        for (char c : str.toCharArray()) {
            if (c == beforeLast) {
                counter2++;
            }
        }
        //Character.isUpperCase(ch);
        
        String str2 = str.replaceAll(Character.toString(beforeLast), "");
        

        System.out.println(counter);
        System.out.println(counter2);
        System.out.println(str.length()-str2.length());
    }

}
