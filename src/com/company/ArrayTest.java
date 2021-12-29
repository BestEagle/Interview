package com.company;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {
        int i;
        int j = 0;
        double ch;
        int arr[] = new int[20];
        int rep = 0;

        for (i = 0; i < arr.length; i++) {
            ch = Math.random() * 100;
            arr[i] = (int) ch; // задали случайные значения

        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                rep++; // количество повторяющихся значений
            }
        }
        System.out.println(rep);
        int arr2[] = new int[arr.length - rep];
        System.out.println(arr2.length);

        int l = 0;
        for (i = 0; i < arr.length; i++) {
            if (i == 0) {
                arr2[j] = arr[i];
                j++;
            } else if (arr[i] != arr[i - 1] && l < arr2.length) {
                    arr2[j] = arr[i];
                    j++;
                    l++;
            }
        }

    }
}
