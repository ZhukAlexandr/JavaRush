package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grMother1 = new Human("Masha", false, 78);
        Human grFather1 = new Human ("Misha", true, 74);
        Human grMother2 = new Human("Dasha", false, 69);
        Human grFather2 = new Human ("Petya", true, 59);

        Human mother = new Human("Anjella", false, 45, grFather1, grMother1);
        Human father = new Human("Vasya", true, 39, grFather2, grMother2);

        Human son = new Human("Sasha", true, 15, father, mother);
        Human daught1 = new Human("Nastya", false, 19, father, mother);
        Human daught2 = new Human("Ira", false, 25, father, mother);

        System.out.println(grMother1);
        System.out.println(grFather1);
        System.out.println(grMother2);
        System.out.println(grFather2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daught1);
        System.out.println(daught2);
    }

    public static class Human {
        private  String name;
        private boolean sex;
        private  int age;
        private  Human father;
        private Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















