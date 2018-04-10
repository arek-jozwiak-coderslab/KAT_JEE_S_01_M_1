package day1.arrays;

public class Main2 {

    public static void main(String[] args) {
        String[] titles = new String[2];
        titles[0]= "Thinking in Java";
        titles[1]= "Java 2 Podstawy";        

        for (String tuuu : titles) {
            System.out.println(tuuu);

        }
        
        int[] numberTab = new int[3];
        numberTab[2] = 10;
        numberTab[1] = 0;
        for (int i = 0; i < numberTab.length; i++) {
            System.out.println(numberTab[i]);
        }
        
        String[] stringTab = new String[2];
     

        for (String tuuu : titles) {
            System.out.println(tuuu);

        }
        
    }
}
