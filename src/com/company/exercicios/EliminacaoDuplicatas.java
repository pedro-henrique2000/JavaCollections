package com.company.exercicios;

import java.util.*;

public class EliminacaoDuplicatas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("0 to stop");
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("0"))
                break;

            list.add(input);
        }

        Set<String> set = new HashSet<>(list);

        set.forEach(s -> System.out.println(s));

    }

}
