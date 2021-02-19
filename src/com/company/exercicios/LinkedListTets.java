package com.company.exercicios;

import java.security.SecureRandom;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTets {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        int quantityOfNumbers = 25;
        SecureRandom random = new SecureRandom();

        for(int i = 0; i < quantityOfNumbers; i++) {
            int number = random.nextInt(100);
            System.out.println("Adding:" + number);
            list.add(number);
        }

        System.out.println("\nBefore Sort: ");
        list.forEach(v -> System.out.print(v + " "));

        Collections.sort(list);

        System.out.println("\nAfter Sort:");
        list.forEach(v -> System.out.print(v + " "));

        int sum = list.stream().reduce(0,(a,b) -> (a + b));
        System.out.println("\nSum is: " + sum);
        System.out.println("Average is: " + sum/quantityOfNumbers);
    }

}
