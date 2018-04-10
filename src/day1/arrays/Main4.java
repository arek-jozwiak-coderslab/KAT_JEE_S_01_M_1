package day1.arrays;

import java.util.Arrays;

public class Main4 {
    
    public static int[] increateTab(int[] tab, int element){
        int[] copyTab = Arrays.copyOf(tab, tab.length+1);
        copyTab[tab.length] = element;
        return copyTab;
    }

    public static void main(String[] args) {
        int[] tab = { 1, 2, 3, 4 };
        int[] newTab = increateTab(tab, 12);    
        
        int[] copyTab = Arrays.copyOf(tab, tab.length+1);
//        copyTab[tab.length+1] = 100;
        
        for (int i = 0; i < copyTab.length; i++) {
            System.out.println(copyTab[i]);
        }
    }

}
