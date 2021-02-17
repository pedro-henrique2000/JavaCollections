package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {

    public static void main(String[] args) {
        String[] colors =
                {"black", "yellow", "pink", "brown", "yellow"};
        List<String> list = new ArrayList<>(Arrays.asList(colors));

        Collections.sort(list);
        System.out.printf("Sorted arraylist: %s%n", list);
        printSearchResults(list, "black");
        printSearchResults(list, "brown");
        printSearchResults(list, "pink");
        printSearchResults(list, "yellow");
        printSearchResults(list, "green");
        printSearchResults(list, "orange");

    }

    private static void printSearchResults(List<String> list, String key) {
        int result = 0;
        System.out.printf("Searching for %s ", key);

        result = Collections.binarySearch(list, key);

        if(result < 0) {
            System.out.println("Not found! " + result);
            return;
        }

        System.out.printf("Found %s, index: %d%n", key, result);

    }

}
