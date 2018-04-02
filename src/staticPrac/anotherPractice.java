package staticPrac;
public class anotherPractice {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.printAge();
    }
}

class Person{
    static int age = 0;
    String name = "Hello";

    static {
        age++;
    }

    public void printAge(){
        System.out.println(age);
        System.out.println(name);
    }


}