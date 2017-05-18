package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private int weight;
        private int height;
        private Human mother;
        private Human father;

        public Human(Human father) {

            this.father = father;
        }

        public Human(int age) {

            this.age = age;
        }

        public Human(String name) {

            this.name = name;
        }

        public Human(int weight, int height, Human mother, Human father) {
            this.weight = weight;
            this.height = height;
            this.mother = mother;
            this.father = father;
        }

        public Human(String name, int age, int weight, int height, Human mother, Human father) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.mother = mother;
            this.father = father;
        }

        public Human(String name, int age, int weight, int height, Human mother) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.mother = mother;
        }

        public Human(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, Human father) {
            this.name = name;
            this.age = age;
            this.father = father;
        }

        public Human(int age, int weight, int height) {
            this.age = age;
            this.weight = weight;
            this.height = height;
        }
    }
}
