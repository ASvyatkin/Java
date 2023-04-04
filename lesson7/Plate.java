package ru.geekbrains.java.lesson7;
//Created by: Andrey Svyatkin
//HomeWork7

public class Plate {
    private int foodAmount;
    public Plate(int foodAmount) {
        this.foodAmount = foodAmount;
    }
    public void addFood(int foodToAdd) {
        this.foodAmount += foodToAdd;
        System.out.println("В тарелку добавлено " + foodToAdd + " ед. еды.");
    }
    public void decreaseFood(int foodToDecrease) {
        foodAmount -= foodToDecrease;
    }
    public int getFoodAmount() {
        return foodAmount;
    }
    public void info(){
        if (foodAmount == 0) {
            System.out.println("Тарелка пуста.");
        } else {
            System.out.println("Тарелка с едой содержит " + getFoodAmount() + " ед. еды.");
        }
    }
}
