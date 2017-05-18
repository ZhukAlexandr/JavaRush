package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       int[] mas = new int[5];
        for (int i = 0; i < 5; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }
        mySort(mas);
        for (int i = 0; i < 5; i++) {
            System.out.println(mas[i]);
        }

    }
    public static void  mySort(int[] mas){
        for (int i = mas.length - 1; i >= 0 ; i--) {
            for (int j = 0; j < i ; j++) {
                int a = mas[j];
                if(mas[j] > mas[j + 1])
                {
                    mas[j] = mas[j+1];
                    mas[j+1] = a;
                }
            }

        }
    }
}
