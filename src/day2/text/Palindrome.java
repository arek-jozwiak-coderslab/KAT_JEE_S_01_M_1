package day2.text;

public class Palindrome {
    public static void main(String[] args) {

        String str = "Kobyła ma mały bok";
        String str3 = str.toLowerCase();
        String str2 = str3.replaceAll(" ", "");
        int size = str2.length() / 2;
        boolean isPalindrom = true;

for (int i = 0; i < size; i++) {
    if (str2.charAt(i) != str2.charAt(str2.length() - 1 - i)) {
        isPalindrom = false;
        break;
    } 
}
        System.out.println(isPalindrom);
    }
}
