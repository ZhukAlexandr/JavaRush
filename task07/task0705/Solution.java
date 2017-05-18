package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int [] mas20 = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            mas20[i] = Integer.parseInt(reader.readLine());
        }

        int [] mas10_1 = new  int[10];
        for (int i = 0; i < 10; i++)
            mas10_1[i] = mas20[i];

        int [] mas10_2 = new int[10];
        for (int i = 0; i < 10; i++) {
            mas10_2[i] = mas20[i + 10];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(mas10_2[i]);
        }
    }
}
