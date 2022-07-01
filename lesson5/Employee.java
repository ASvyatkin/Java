package ru.geekbrains.java.lesson5;

//Created by: Andrey Svyatkin
//HomeWork5

import java.util.Arrays;

public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String surname, String name, String patronymic, String position, String email, String phone, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }
    public void printInfo(){
        System.out.println("surname: " + surname + "; name: " + name + "; patronymic: " + patronymic + "; position:" + position + "; email: " + email + "; phone: " + phone + "; salary: " + salary + "; age: " + age);
    }

    public int getAge() {

        return age;
    }
}
