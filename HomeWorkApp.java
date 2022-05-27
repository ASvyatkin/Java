package ru.geekbrains.lesson1;

//Created by: Andrey Svyatkin
/*
   First Java Class
 */
public class HomeWorkApp {
    public static void main(String[] arg) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("-----2 задание-----");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Aple");

    }

    public static void checkSumSign() {
        System.out.println("-----3 задание-----");
        int a = 10;
        int b = -15;
        if ((a + b) >= 0) {
            System.out.println("сумма положительная");
        } else {
            System.out.println("сумма отрицательная");
        }
    }

    public static void printColor() {
        System.out.println("-----4 задание-----");
        int value = 101;
        if (value <= 0) {
            System.out.println("красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("жёлтый");
        } else {
            System.out.println("зелёный");

        }
    }

    public static void compareNumbers() {
        System.out.println("-----5 задание-----");
        int a = 2, b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}