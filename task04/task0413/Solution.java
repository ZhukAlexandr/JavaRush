package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(reader.readLine());
        String dayName;

            if (day == 1)
                dayName = "понедельник";
            else if (day == 2)
                dayName = "вторник";
            else if (day == 3)
                dayName = "среда";
            else if (day == 4)
                dayName = "четверг";
            else if (day == 5)
                dayName = "пятница";
            else if (day == 6)
                dayName = "суббота";
            else if (day == 7)
                dayName = "воскресенье";
            else
                dayName = "такого дня недели не существует";

            System.out.println(dayName);
    }
}