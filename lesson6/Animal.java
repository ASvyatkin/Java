package ru.geekbrains.java.lesson6;
//Created by: Andrey Svyatkin
//HomeWork6
public class Animal {
    String name;
    public int maxRunDistance;
    public int maxSwimDistance;

    public int getMaxRunDistance() {
        return this.maxRunDistance;
    }

    public int getMaxSwimDistance() {
        return this.maxSwimDistance;
    }

    public String getName() {
        return this.name;
    }

    public void run(int distanceToRun) {
        if (this.maxRunDistance == 0) {
            System.out.println(this.getName() + " не умеет бегать.");
        } else if (distanceToRun > this.maxRunDistance) {
            System.out.println(this.getName() + " не смог пробежать " + distanceToRun + " м.");
        } else {
            System.out.println(this.getName() + " пробежал " + distanceToRun + " м.");
        }
    };

    public void swim(int distanceToSwim) {
        if (this.maxSwimDistance == 0) {
            System.out.println(this.getName() + " не умеет плавать.");
        } else if (distanceToSwim > this.maxSwimDistance) {
            System.out.println(this.getName() + " не смог проплыть " + distanceToSwim + " м.");
        } else {
            System.out.println(this.getName() + " проплыл " + distanceToSwim + " м.");
        }
    }
}
