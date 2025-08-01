package ExecptionHandleAndErrror;


import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> employees = new TreeMap<>();

        employees.put(103, "Zadhan");
        employees.put(101, "Madhan");
        employees.put(102, "Sachin");

      

        System.out.println("Employee names in alphabetical order:");
        employees.values().stream()
            .sorted()
            .forEach(System.out::println);
    }
}
