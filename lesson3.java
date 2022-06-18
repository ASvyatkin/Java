package ru.geekbrains.java;

//Created by: Andrey Svyatkin

import java.util.Arrays;

public class lesson3 {

    public static void main(String[] args) {
        System.out.println("-----1 задание-----");
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++)
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        System.out.println(Arrays.toString(array));

        System.out.println("-----2 задание-----");
        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++)
            array2[i] = i + 1;
        System.out.println(Arrays.toString(array2));

        System.out.println("-----3 задание-----");
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array3));
        for (int i = 0; i < array3.length; i++)
            if (array3[i] < 6)
                array3[i] *= 2;
        System.out.println(Arrays.toString(array3));

        System.out.println("-----4 задание-----");
        int[][] array4 = new int[5][5];
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0, x = array4[i].length; j < array4[i].length; j++, x--) {
                if (i == j || i == x - 1) array4[i][j] = 1;
                System.out.print(array4[i][j] + " ");
            }
            System.out.print("\n");
        }


        System.out.println("-----5 задание-----");

    }
    public static int[] returnArrayMethod(int len, int initValue) {
        int[] Array5 = new int[len];
        for (int i = 0; i < Array5.length; i++){
            Array5[i] = initValue;
        }
        return Array5;
    }
}
