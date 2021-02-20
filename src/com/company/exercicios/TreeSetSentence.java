package com.company.exercicios;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSentence {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        createSet(set);
        displaySet(set);
    }

    private static void createSet(Set<String> set) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = sc.nextLine();
        String[] tokens = input.split(" ");

        for(String token : tokens) {
            set.add(token);
        }
    }

    private static void displaySet(Set<String> set) {
        set.forEach(v -> System.out.println(v + " "));
    }

}
