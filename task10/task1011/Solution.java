package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        char [] mas = s.toCharArray();
        for (int i = 0; i < 40; i++) {
            if (mas[i] != ' ') {
                for (int j = i; j < mas.length; j++) {
                    System.out.print(mas[j]);
                }
            }
            else
                for (int j = i + 1; j < mas.length; j++) {
                    System.out.print(mas[j]);
                }
            System.out.println();
        }

        //напишите тут ваш код
    }

}

