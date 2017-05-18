package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int count = 0;
        int num;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            num = Integer.parseInt(reader.readLine());
            if (num > 0)
                count ++;
        }
        System.out.println(count);



    }
}
