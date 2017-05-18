package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String sNum = reader.readLine();
        int num = Integer.parseInt(sNum);
        String s2 = "";

        String chet_nechet;
        if (num % 2  == 0)
            chet_nechet = "четное";
        else
            chet_nechet = "нечетное";

        if(sNum.length() == 1)
            s2 = "однозначное";
        else if (sNum.length() == 2)
            s2 = "двузначное";
        else if (sNum.length() == 3)
            s2 = "трехзначное";

        if(num >= 1 && num <= 999)
            System.out.println( chet_nechet + " " + s2 + " число");
    }
}
