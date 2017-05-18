package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        int summ = 0;
        boolean isFinish = false;
        while (!isFinish){
            String sNum = reader.readLine();
            if (!"сумма".equals(sNum)){
                summ += Integer.parseInt(sNum);
            }
            else
                isFinish = true;
        }
        System.out.println(summ);
    }
}
