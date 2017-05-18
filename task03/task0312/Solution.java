package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    public static int convertToSeconds (int hour)
    {
        return  hour * 3600;
    }

    public static void main(String[] args) {
        int sec1, sec2;
        sec1 = convertToSeconds(1);
        sec2 = convertToSeconds(2);
        System.out.println(sec1);
        System.out.println(sec2);

    }
}
