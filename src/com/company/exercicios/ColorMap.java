package com.company.exercicios;


import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ColorMap {

    public static void main(String[] args) {
        Map<String, Color> colorMap = new HashMap<>();
        createMap(colorMap);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a color: ");
        String input = scanner.nextLine().toLowerCase();

        if(colorMap.containsKey(input))
            System.out.println(colorMap.get(input));
        else
            System.out.println("Color not found!");

    }

    private static void createMap(Map<String, Color> map) {
        map.put("black", Color.BLACK);
        map.put("white", Color.WHITE);
        map.put("light gray", Color.lightGray);
        map.put("gray", Color.GRAY);
        map.put("dark gray", Color.DARK_GRAY);
        map.put("red", Color.RED);
        map.put("pink", Color.PINK);
        map.put("orange", Color.ORANGE);
        map.put("yellow", Color.YELLOW);
        map.put("green", Color.GREEN);
        map.put("magenta", Color.MAGENTA);
        map.put("cyan", Color.cyan);
        map.put("blue", Color.blue);
    }
}
