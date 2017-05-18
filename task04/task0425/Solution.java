package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int res = 0;
        if (x > 0 && y > 0)
            res = 1;
        else  if (x > 0 && y < 0)
            res = 4;
        else  if (x < 0 && y < 0)
            res = 3;
        else if (x < 0 && y > 0)
            res = 2;
        System.out.println(res);
    }
}
