package ru.geekbrains.java.lesson7;
//Created by: Andrey Svyatkin
//HomeWork7

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Вирсик", 30), new Cat("Барсик", 10), new Cat("Мурзик", 50)};
        Plate plate = new Plate(100);

        plate.info();

        cats[0].eat(plate);
        cats[1].eat(plate);
        cats[1].eat(plate);
        cats[2].eat(plate);
        plate.info();

        for (Cat cat : cats) {
            if (cat.isSatisfied()) {
                System.out.println(cat.getName() + " сыт.");
            } else System.out.println(cat.getName() + " голоден.");
        }
        plate.addFood(10);
        cats[2].eat(plate);
        plate.info();
    }
}
