package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        Cat tomCat = new Cat("Tom", "Gray", 3);

        Dog dog = new Dog("Dog", "Brown", 5);

        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static  class Cat {
        private String name;
        private String color;
        private int weight;

        public Cat( String name, String color, int weight){
            this.name = name;
            this.color = color;
            this.weight = weight;
        }
    }

    public static class Dog {
        private String name;
        private String color;
        private int weight;

        public Dog(String name, String color, int weight) {
            this.name = name;
            this.color = color;
            this.weight = weight;
        }
    }




    //напишите тут ваш код
}
