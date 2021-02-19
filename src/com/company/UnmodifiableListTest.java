package com.company;
import java.util.*;

public class UnmodifiableListTest {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("yellow", "black", "pink", "cyan"));
        List<String> list2 = Collections.unmodifiableList(list1);
//        list2.remove("yellow"); unsupportedOperationException
//        list2.add("green"); unsupportedOperationException
    }}
