package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double minute = Double.parseDouble(reader.readLine());
        double ost = minute % 5;
        String color;

        if (ost < 3)
            color = "зелёный";
        else  if (ost < 4)
            color = "желтый";
        else
            color = "красный";

        System.out.println(color);


    }
}