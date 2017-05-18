package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int poloz = 0;
        int otric = 0;
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        while (true){
            String s = reader.readLine();
            if (s.equals("exit"))
                break;
            int k = Integer.parseInt(s);
            if (k > 0)
                poloz ++;
            else  if (k < 0)
                otric ++;
        }

        System.out.println("количество отрицательных чисел: " + otric);
        System.out.println("количество положительных чисел: " + poloz);
    }
}
