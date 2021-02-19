package com.company.exercicios;

import java.text.Normalizer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicatedWords {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        createMap(map);
        displayMap(map);
    }

    private static void createMap(Map<String, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        for(String word : words) {
            String wordFinal = removerAcentos(word.toLowerCase());

            if(map.containsKey(wordFinal))
                map.put(wordFinal, map.get(wordFinal) + 1);

            else
                map.put(wordFinal, 1);
        }
    }

    private static void displayMap(Map<String, Integer> map) {
        map.forEach((k, v) -> System.out.println(k + " " + v));
    }

    private static String removerAcentos(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
}
