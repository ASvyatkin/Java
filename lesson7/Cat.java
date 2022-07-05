package ru.geekbrains.java.lesson7;
//Created by: Andrey Svyatkin
//HomeWork7

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public void eat(Plate plate) {
        if (plate.getFoodAmount() >= appetite && !isSatisfied()) {
            plate.decreaseFood(appetite);
            satiety = true;
            System.out.println(name + " съел(а) " + appetite + " ед. еды.");
        } else if (isSatisfied()){
            System.out.println(name + " сыт(а) и больше не хочет кушать.");
        } else {
            System.out.println(name + " не смог(ла) покушать, в тарелке не хватило еды.");
        }
    }
    public boolean isSatisfied(){
        return satiety;
    }
    public String getName() {
        return name;
    }
}

