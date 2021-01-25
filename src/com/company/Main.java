package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 4, 6};

        System.out.println(generateNumber(array));
    }


    public static String generateNumber(int[] array) {
        int skip = 0;
        List<Integer> skips = new ArrayList<>();

        if (array.length == 1 && array[0] != 1)
            skip = array[0] - 1;
        else skip = 2;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] > 1) {
                skips.add(array[i + 1] - array[i]);
                skip = Collections.min(skips);
            } else skip = array.length + 1;
        }

        return String.format("%1$" + 3 + "s", skip).replace(' ', '0');
    }
}

