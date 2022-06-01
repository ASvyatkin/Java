package ru.geekbrains.java;
//Created by: Andrey Svyatkin

public class lesson2 {
    public static void main(String[] args) {
        metodTask1(10, 10);
        metodTask2(-7);
        metodTask3(5);
        metodTask4("Home Work Lesson2");
    }

    public static boolean metodTask1(int a, int b) {
        int sum = a + b;
        System.out.println("-----1 задание-----");
        if (sum >= 10 && sum <= 20) return true;
        else {
            return false;
        }
    }

    public static void metodTask2(int a) {
        System.out.println("-----2 задание-----");
        if (a >= 0) System.out.println(a + "-число положительное");
        else {
            System.out.println(a + "-число отрицательное");
        }
    }

    public static boolean metodTask3(int a) {
        System.out.println("-----3 задание-----");
        if (a >= 0 ) return true;
        else {
            return false;
        }
    }
    public static void metodTask4(String name) {
        System.out.println("-----4 задание-----");
        for (int i = 0; i < 4; i++)
        System.out.println(name);
    }
}