package ExecptionHandleAndErrror;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Convert List to Array
        String[] array = list.toArray(new String[0]);

        System.out.println("Array elements:");
        for (String s : array) {
            System.out.println(s);
        }
    }
}

