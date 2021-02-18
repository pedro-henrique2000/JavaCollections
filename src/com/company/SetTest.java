package com.company;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        String[] colors =
                {"black", "white", "blue", "green", "gray", "orange", "tan","white", "cyan", "peach", "gray", "orange"};
        List<String> stringList = Arrays.asList(colors);

        System.out.printf("List: %d %s%n",stringList.size(), stringList);

        printNonDuplicates(stringList);

    }

    private static void printNonDuplicates(Collection<String> collection) {
        Set<String> set = new HashSet<>();
        set.addAll(collection);
        System.out.printf("Set: %d %s%n", set.size(), set);
    }
}
