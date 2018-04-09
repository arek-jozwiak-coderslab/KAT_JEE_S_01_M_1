
public class Main2 {
    
    final double PI = 3.146;
    final double PI2 = 3.146;
    final double PI3 = 3.146;

    public static void main(String[] args) {
        User user1 = new User();
        user1.age = 100;
        User user2 = user1;
        user2.age = 25;
        System.out.println(user1.age);
//        int public = 12; nie można

    }

}
