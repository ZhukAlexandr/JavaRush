package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        if ((this.age + this.weight + this.strength) < (anotherCat.age + anotherCat.weight + anotherCat.strength))
            return  false;
        else
            return  true;

    }

    public static void main(String[] args) {

    }
}
