package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        int sum = 0;
        boolean isFinished = false;
        while (!isFinished){
            String s = reader.readLine();
            sum += Integer.parseInt(s);
            if(s.equals("-1"))
                isFinished = true;
        }
        System.out.println(sum);
    }
}
