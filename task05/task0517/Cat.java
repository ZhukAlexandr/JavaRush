package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    private  String name;
    private  int age;
    private int weight;
    private String  address;
    private String color;

    public Cat(String name){
        this.name = name;
        age = 1;
        weight = 5;
        color = "Green";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        color = "a";
        weight = 2;
    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "red";
    }

    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
        age = 2;
    }

    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 5;

    }

    public static void main(String[] args) {

    }
}
