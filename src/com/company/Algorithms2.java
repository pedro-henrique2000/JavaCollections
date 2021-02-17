package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms2 {

    public static void main(String[] args) {
        String[] colors = {"blue","white", "yellow" };
        List<String> list =  new ArrayList<>(Arrays.asList(colors));
        ArrayList<String> list2 = new ArrayList<>();

        list2.add("black");
        list2.add("green");
        list2.add("red");
        list2.add("yellow");

        System.out.printf("Before add all, list2 contains: %s%n", list2);

        Collections.addAll(list2, colors);

        System.out.printf("After add all, list2 contains: %s%n", list2);

        String colorSearch = "yellow";

        int frequency = Collections.frequency(list2, colorSearch);
        System.out.printf("list2 contains %d %s%n", frequency, colorSearch);

        boolean disjoint = Collections.disjoint(list, list2);
        System.out.printf("list and list2 %s elements in common%n",
                disjoint ? "don't have" : "have");

    }
}
