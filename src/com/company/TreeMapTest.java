package com.company;

import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("f", 1);
        treeMap.put("d", 2);
        treeMap.put("c", 3);
        treeMap.put("b", 4);
        treeMap.put("e", 5);
        treeMap.put("a", 6);
        treeMap.forEach((k, s) -> System.out.println(k + " : " + s));
    }
}