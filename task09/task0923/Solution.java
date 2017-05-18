package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        char[] mas = line.toCharArray();
        ArrayList<Character> list_glas = new ArrayList<>();
        ArrayList<Character> list_soglas = new ArrayList<>();
        for (char x : mas) {
            if (isVowel(x))
                list_glas.add(x);
            else if(x != ' ')
                list_soglas.add(x);
        }

        for (char s: list_glas){
            System.out.print(s + " ");
        }
        System.out.println();
        for (char s: list_soglas){
            System.out.print(s + " ");
        }

    }





    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}