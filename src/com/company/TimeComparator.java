package com.company;

import java.util.Comparator;

public class TimeComparator implements Comparator<Time> {
    @Override
    public int compare(Time time1, Time time2) {
        int hourDifference = time1.getHours() - time2.getHours();

        if(hourDifference != 0)
            return hourDifference;

        int minuteDifference = time1.getMinutes() - time2.getMinutes();

        if(minuteDifference != 0)
            return minuteDifference;

        int secondDifference = time1.getSeconds() - time2.getSeconds();
        return secondDifference;

    }
}
