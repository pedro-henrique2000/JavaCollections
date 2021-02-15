package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {

    public static void main(String[] args) {
        String[] colors =
                {"black", "red", "yellow", "blue", "green"};

        List<String> list1 = new LinkedList<>();

        for(String color : colors)
            list1.add(color);

        List<String> list2 = new LinkedList<>(Arrays.asList("silver", "gray", "pink"));

        list1.addAll(list2);
        list2 = null;
        printList(list1);

        toUpperCase(list1);
        printList(list1);

        System.out.println("removing elements from 4 to 6");
        removeItems(list1, 4,6);
        printList(list1);

        System.out.println("Reverse");
        reverse(list1);
        printList(list1);


    }

    private static void printList(List<String> list) {
        System.out.println("\nList:");
        list.forEach(i -> System.out.print(i + " "));
        System.out.println();
    }

    private static void removeItems(List<String> list, int start, int end) {
        list.subList(start,end).clear();
    }

    private static void toUpperCase(List<String> list) {
        ListIterator<String> iterator = list.listIterator();

        while(iterator.hasNext()) {
            String currentColor = iterator.next();
            iterator.set(currentColor.toUpperCase());
        }
    }

    private static void reverse(List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());

        while(iterator.hasPrevious()){
            System.out.print(iterator.previous() + " ");
        }

        System.out.println();
    }


}
