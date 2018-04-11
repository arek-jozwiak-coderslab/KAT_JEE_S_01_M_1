package day3.exe;

public class Main1 {

    public static void main(String[] args) {

        String[] part = "some string".split(" ");
        int[] numbers = { 9, 0 };
        String s = "eee";
        int a = Integer.parseInt(s);
        
        try {
            System.out.println(part[1]);
            System.out.println(part[2]);
            System.out.println(2 / numbers[1]);
            System.out.println(part[3]);
            System.out.println(part[4]);

        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("WRACAJ DO LICEUM !!!");
        } catch (ArrayIndexOutOfBoundsException execteptiopn) {
            System.out.println("THINKING IN JAVA 69 strona - czytaj z uwagą.");
            execteptiopn.printStackTrace();
        }

        finally {
            System.out.println("ZAWSZE");
        }
        System.out.println("Wygrałeś 1k euro hurraaa!!!!");

    }

}
