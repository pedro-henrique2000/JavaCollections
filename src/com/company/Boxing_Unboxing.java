package com.company;


public class Boxing_Unboxing {

    public static void main(String[] args) {
        Integer[] values = new Integer[5];
        values[0] = 10; //autoboxing
        int value = values[0]; //auto-unboxing
        System.out.println(value);

    }


}
