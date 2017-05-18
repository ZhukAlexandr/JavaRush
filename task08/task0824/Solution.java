package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        Human son1 = new Human("Oleg", true, 15);
        Human son2 = new Human("Vitya", true, 21);
        Human dought = new Human("Vika", false, 7);

        ArrayList<Human> children = new ArrayList<>();
        children.add(son1);
        children.add(son2);
        children.add(dought);

        Human father = new Human("Дима", true, 45, children);
        Human mother = new Human("Anjela", false, 42, children);

        ArrayList<Human> children_father = new ArrayList<>();
        children_father.add(father);

        ArrayList<Human> children_mother = new ArrayList<>();
        children_mother.add(mother);

        Human grFather1 = new Human("Дед Миша", true, 65, children_father);
        Human grMother1 = new Human("Баба маша", false, 56, children_father);
        Human grFather2 = new Human("Дед Игар", true, 78, children_mother);
        Human grMother2 = new Human("Баба Варя", false, 87, children_mother);

        System.out.println(grFather1);
        System.out.println(grMother1);
        System.out.println(grFather2);
        System.out.println(grMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(dought);
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public  Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>();
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
