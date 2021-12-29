package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 3, 4};
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Номер проекта: " + generateNumber(array));
        System.out.println("Номер проекта: " + generateNumberFromList(list));

    }


    public static String generateNumber(int[] array) {
        int skip;
        List<Integer> skips = new ArrayList<>();

        if (array.length == 1 && array[0] != 1)
            skip = array[0] - 1;
        else skip = array.length + 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] > 1) {
                skips.add(array[i + 1] - array[i]);
                skip = Collections.min(skips);
            }
        }

        return String.format("%1$" + 3 + "s", skip).replace(' ', '0');


    }

    public static String generateNumberFromList(List<Integer> list) {
        int skip;
        List<Integer> skips = new ArrayList<>();

        if (list.size() == 1 && list.get(0) != 1)
            skip = list.get(0) - 1;
        else skip = list.size() + 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) - list.get(i) > 1) {
                skips.add(list.get(i + 1) - list.get(i));
                skip = Collections.min(skips);
            }
        }

        return String.format("%1$" + 3 + "s", skip).replace(' ', '0');


    }
}

