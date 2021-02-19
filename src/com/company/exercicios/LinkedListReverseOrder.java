package com.company.exercicios;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkedListReverseOrder {

    public static void main(String[] args) {
        List<Character> list1 = new LinkedList<>();
        createList(list1);
        System.out.println("Original List: ");
        displayList(list1);
        List<Character> list2 = reverseList(list1);
        System.out.println("\nOriginal List Reverted:");
        displayList(list2);
    }

    private static void createList(List<Character> list) {
        int quantityOfChars = 10;
        Random random = new Random();

        for(int i = 0; i < quantityOfChars; i++) {
            list.add((char) (random.nextInt(27) + 'a'));
        }
    }

    private static void displayList(List<Character> list) {
        list.forEach(v -> System.out.print(v + " "));
    }

    private static List<Character> reverseList(List<Character> list) {
        List<Character> list2 = new LinkedList<>();
        list2.addAll(list);
        Collections.reverse(list2);
        return list2;
    }

}
