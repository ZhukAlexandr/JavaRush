package com.javarush.task.task05.task0507;




import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        boolean isFinish = false;
        int count = 0;
        int sum = 0;
        while (!isFinish) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(reader.readLine());
            if (num != -1){
                sum += num;
                count++;
            }
            else
                isFinish = true;

        }
        System.out.println((double) sum / count);
    }
}

