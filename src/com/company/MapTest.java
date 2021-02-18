package com.company;

import java.util.*;

public class MapTest {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        createMap(map);
        displayMap(map);
    }

    private static void createMap(Map<String, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = scanner.nextLine();

        String[] tokens = input.split(" ");

        for(String token : tokens) {
            if(map.containsKey(token)) {
                int count = map.get(token);
                map.put(token, count + 1);
            } else {
                map.put(token, 1);
            }
        }
    }

    private static void displayMap(Map<String, Integer> map) {
        Set<String> keys = map.keySet();
        TreeSet<String> treeSet = new TreeSet<>(keys);

        System.out.println("Display Map: ");

        for(String key : treeSet) {
            System.out.printf("%s\t%d%n", key, map.get(key));
        }

    }
}
