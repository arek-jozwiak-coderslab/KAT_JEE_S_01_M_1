
public class Main1 {
    
    public static void sayHello(){
        System.out.println("Hello !!");
    }

    public static void main(String[] args) {
        
        sayHello();
        Main1.sayHello();

        User user = new User();
         
        user.age = 35;
        System.out.println(user.age);
        user.printAge();
        user.printWhenRetirement();
        int whenRetirmentYears = user.whenRetirement("Katowice");
        System.out.println(whenRetirmentYears);
        System.out.println(user.whenRetirement("Płock"));
    }

}
