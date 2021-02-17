package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms1 {
    public static void main(String[] args) {
        Character[] characters = {'P', 'M', 'C'};
        List<Character> characterList = Arrays.asList(characters);
        output(characterList);

        //copy
        System.out.println("\nCopy List: ");
        Character[] characters1 = new Character[3];
        List<Character> copyList = Arrays.asList(characters1);
        Collections.copy(copyList, characterList);
        output(copyList);

        //fill
        System.out.println("\nFillt list: ");
        Collections.fill(copyList, 'R');
        output(copyList);

    }

    private static void output(List<Character> list) {
        System.out.println("The list is: ");

        for(Character element : list) {
            System.out.printf("%s " , element);
        }

        System.out.printf("%nMax: %s%n", Collections.max(list));
        System.out.printf("Min: %s%n", Collections.min(list));
    }
}
