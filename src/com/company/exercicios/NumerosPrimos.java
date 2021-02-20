package com.company.exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumerosPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int number = scanner.nextInt();

        if(!isPrime(number)) {
            factor(set, number);
            set.forEach(v -> System.out.print(v + " "));
        } else {
            System.out.println("Número Primo!");
        }
    }

    private static boolean isPrime(int number) {
        if(number <= 1)
            return false;

        for(int i = 2; i < number; i++) {
            if(number % i == 0)
                return false;
        }

        return true;
    }

    private static void factor(Set<Integer> set, int number) {
        int i = 2;

        while (number != 1) {
            if(number % i == 0) {
                number /= i;
                if(!set.contains(i))
                    set.add(i);

                i = 2;
            } else {
                i++;
            }
        }

    }

}
