package com.company;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

    public static void main(String[] args ) {
        String[] colors =
                {"yellow", "green", "black", "tan", "grey", "white", "orange", "red", "green"};
        SortedSet<String> sortedSet = new TreeSet<>(Arrays.asList(colors));

        System.out.println("sorted set: ");
        printSet(sortedSet);

        System.out.println("\nheadset orange\n");
        printSet(sortedSet.headSet("orange"));

        System.out.println("\ntailset orange\n");
        printSet(sortedSet.tailSet("orange"));

        System.out.println("\nfirst and last");
        System.out.println(sortedSet.first());
        System.out.println(sortedSet.last());

    }

    private static void printSet(SortedSet<String> set) {
        set.forEach(System.out::println);
    }

}
