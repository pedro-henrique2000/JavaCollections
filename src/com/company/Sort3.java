package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort3 {

    public static void main(String[] args) {
        List<Time> timeList = new ArrayList<>();

        timeList.add(new Time(6,15,35));
        timeList.add(new Time(20,45,20));
        timeList.add(new Time(6,23,50));
        timeList.add(new Time(19,26,32));
        timeList.add(new Time(23,23,33));
        timeList.add(new Time(14,41,14));

        System.out.println("Unsorted List: ");
        System.out.println(timeList);

        System.out.println("\nSorted List");
        Collections.sort(timeList, new TimeComparator());
        System.out.println(timeList);

    }
}
