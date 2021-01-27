package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        System.out.println("Номер проекта: " + generateNumber(list));

    }




    public static String generateNumber(List<Integer> list) {
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

