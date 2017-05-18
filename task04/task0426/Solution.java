package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/
import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        String chet_nechet;
        String polozhit;
        if (a % 2 == 0)
            chet_nechet = "четное";
        else
            chet_nechet = "нечетное";

        if (a > 0)
            polozhit = "положительное";
        else
            polozhit = "отрицательное";

        if ( a == 0 )
            System.out.println("ноль");
        else
            System.out.println(polozhit + " " + chet_nechet + " " + "число");

    }
}
