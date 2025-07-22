package JavaoopsPackage;


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

   
    public String getName() {
        return name;
    }

   
    public int getAge() {
        return age;
    }
}

public class ClassPerson {
    public static void main(String[] args) {
        
        Person person1 = new Person("Madhan", 30);
        System.out.println(person1.getName()); // Output: Madhan
        System.out.println(person1.getAge());  // Output: 30
    }
}
