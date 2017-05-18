package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Petka", 21, "Minsk");
        Man man2 = new Man("Vasya", 48, "Brest");
        Woman woman1 = new Woman("Dasha", 12, "Kiev");
        Woman woman2 = new Woman("Mashka", 88, "Moskov");

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }

    public  static class Man {
        private  String name;
        private  int age;
        private  String address;

        public Man( String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public  String toString(){
            return name + " " + age + " " + address;
        }
    }
    public  static class Woman {
        private  String name;
        private  int age;
        private  String address;

        public Woman( String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public  String toString(){
            return name + " " + age + " " + address;
        }
    }
}
