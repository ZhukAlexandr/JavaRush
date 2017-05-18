package com.javarush.task.task10.task1012;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
        for (char c : abcArray)
            map.put(c, 0);
        for (String s : list) {
            char[] masChar = s.toCharArray();
            for (char c : masChar)
                if (map.containsKey(c)) {
                    int count = map.get(c);
                    count++;
                    map.replace(c, count);
                }

        }
        for (char x: abcArray) {
            System.out.println(x+ " " + map.get(x));
        }
    }
}