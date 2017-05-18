package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[] chars =  s.toCharArray();
        if(chars.length > 0)
            chars[0] = Character.toString(chars[0]).toUpperCase().charAt(0);
        for (int i = 0; i < chars.length - 1; i++) {
            if(chars[i] == ' ')
                chars[i + 1] = Character.toUpperCase(chars[i + 1]);

        }

        for (int i = 0; i < chars.length ; i++) {
            System.out.print(chars[i]);

        }
        //напишите тут ваш код
    }
}
