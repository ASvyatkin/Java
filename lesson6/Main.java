package ru.geekbrains.java.lesson6;
//Created by: Andrey Svyatkin
//HomeWork6
public class Main {
    public static void main(String[] args) {
        Cat catMurzik = new Cat("Мурзик");
        Dog dogTuzik = new Dog("Тузик");

        catMurzik.run(300);
        catMurzik.run(50);
        catMurzik.swim(120);

        dogTuzik.run(700);
        dogTuzik.run(200);
        dogTuzik.swim(5);
        dogTuzik.swim(25);
    }
}