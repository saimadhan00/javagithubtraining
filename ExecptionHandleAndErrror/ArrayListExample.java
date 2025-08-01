package ExecptionHandleAndErrror;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Madhan");
        list.add("SaiMadhan");
        list.add("Sachin");

        System.out.println("Before removing: " + list);

        // Remove all elements
        list.clear();

        System.out.println("After removing: " + list);  // should print empty list
    }
}
