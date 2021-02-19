package com.company.exercicios;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class LetterCount {

    public static void main(String[] args) {
        Map<Character, Integer> characterIntegerMap = new TreeMap<>();
        createMap(characterIntegerMap);
        displayMap(characterIntegerMap);
    }

    private static void createMap(Map<Character, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        for(String word : words) {
            for(Character character : word.toCharArray()) {
                if(map.containsKey(character))
                    map.put(character, map.get(character) + 1);
                else
                    map.put(character, 1);
            }
        }
    }

    private static void displayMap(Map<Character, Integer> map) {
        map.forEach((k, v) -> System.out.printf("%s\t%d%n", k , v));
    }

}
