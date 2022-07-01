package ru.geekbrains.java.lesson5;

//Created by: Andrey Svyatkin
//HomeWork5


import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov","Ivan","Ivanovich","director","ivanov@mail.ru","89998887766",60000,45);
        empArray[1] = new Employee("Petrov","Petr","Petrovich","manager","petrov@mail.ru","89997776655",30000,25);
        empArray[2] = new Employee("Alexeev","Alexey","Alexeevich","manager","alexeev@mail.ru","89996665544",35000,30);
        empArray[3] = new Employee("Andreev","Andrey","Andreevich","engineer","andreev@mail.ru","89995554433",38000,42);
        empArray[4] = new Employee("Sergeev","Sergey","Sergeevich","engineer","sergeev@mail.ru","89994443322",20000,20);
        for (int i = 0; i < empArray.length; i++) {
            if(empArray[i].getAge() > 40){
                empArray[i].printInfo();
            }
        }

    }
}
