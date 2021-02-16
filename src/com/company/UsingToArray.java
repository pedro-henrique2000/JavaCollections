package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class UsingToArray {

    public static void main(String[] args) {
        String[] colors = {"black", "yellow", "red"};
        LinkedList<String> list = new LinkedList<>(Arrays.asList(colors));

        list.addLast("gray");
        list.add(3, "green");
        list.addFirst("cyan");
        list.add("purple");

        colors = list.toArray(new String[list.size()]);

        for(String color : colors)
            System.out.println(color);
    }
}
