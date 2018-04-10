package day2.text;

public class Main1 {

    public static void main(String[] args) {
        String text = "abc";
        System.out.println(text);
        String text2 = text.toUpperCase();
        System.out.println(text2);
        
        String joinText =
                String.join("--", "Java", "8","News"); 
        
        System.out.println(joinText);
        
        String joinText2 = "Java" + "--" + "8" +"--" + "News";
        
    }

}
