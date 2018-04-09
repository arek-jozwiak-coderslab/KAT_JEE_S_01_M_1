package day1.methods;

public class Main2 {

    static int multiply(int multipler, int index) {
        return multipler * index;
    }

    static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        int result = multiply(13, 13);
        System.out.println(result);
        int resultSquare = square(44);
        System.out.println(resultSquare);
    }

}
