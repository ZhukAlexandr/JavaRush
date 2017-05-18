package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        if ( number > 0 )
            System.out.println(2 * number);
        else if (number < 0 )
            System.out.println( 1 + number);
        else
            System.out.println(number);

    }

}