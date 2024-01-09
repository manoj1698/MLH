package listSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(2);
        integerList.add(8);
        integerList.add(1);

        // Sort the list
        Collections.sort(integerList);

        // Print the sorted list
        System.out.println("Sorted List of Integers: " + integerList);

        // Create a list of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("banana");
        stringList.add("apple");
        stringList.add("orange");

        // Sort the list using a custom comparator
        Collections.sort(stringList, String.CASE_INSENSITIVE_ORDER);

        // Print the sorted list
        System.out.println("Sorted List of Strings: " + stringList);
    }
}
