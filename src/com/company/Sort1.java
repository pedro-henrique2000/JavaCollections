package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort1 {

    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        List<String> list = Arrays.asList(suits);
        System.out.println("Unsorted List:");
        list.forEach(s -> System.out.print(s + " "));

        Collections.sort(list);
        System.out.println("\n\nSorted List: ");
        list.forEach(s -> System.out.print(s + " "));

    }

}
