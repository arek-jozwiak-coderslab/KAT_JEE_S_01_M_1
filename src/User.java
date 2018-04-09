
public class User {

    public int age;
    public int retirementAge = 67;
    public String city;

    public void printAge() {
        System.out.println("age = " + age);
    }

    public int whenRetirement(String city) {
        if (city.equals("Katowice")) {
            return retirementAge + 2 - age;
        } 
        return retirementAge - age;
    }

    public void printWhenRetirement() {
        System.out.println(retirementAge - age);
    }
}
