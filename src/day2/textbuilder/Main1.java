package day2.textbuilder;

public class Main1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("text 1 ").append("aaaaaaaaaaa");
        sb.append("text 2 ");
        sb.append(10);
        sb.append(' ');
        sb.append("text 3");

        String someString = sb.toString();
        String someUpper = someString.toUpperCase();
        System.out.println(someString);

        String text = "kajak";
        StringBuilder builder = new StringBuilder();
        builder.append(text);
        builder.reverse();
        if(text.equals(builder.toString())){
            System.out.println("Jest palindrom");
        }else{
            System.out.println("nie palindrom");
        }
    }

}
