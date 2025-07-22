package JavaoopsPackage;

public class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // raiseSalary method
    public void raiseSalary(double percent) {
        if (percent > 0) {
            salary += salary * percent / 100;
        }
    }

    public static void main(String[] args) {
       
        Employee emp = new Employee(101, "Madhan Kumar", 50000);

        
        System.out.println("Before raise: " + emp.getSalary()); 

        emp.raiseSalary(10);  
        
        System.out.println("After 10% raise: " + emp.getSalary());
    }
}
