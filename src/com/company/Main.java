package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] nomes = {"PEDRO", "HENRIQUE", "CARLOS", "JOÃO", "GUSTAVO"};
        LinkedList<String> list = new LinkedList<>(Arrays.asList(nomes));

        list.add(0, "HOLAN");

        list.forEach(System.out::println);


    }

}
