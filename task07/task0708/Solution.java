package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5 ; i++) {
            list.add(reader.readLine());
        }
        String s = list.get(0);
        int maxLen = s.length();
        for (int i = 1; i < 5; i++){
            s = list.get(i);
            if (maxLen < s.length())
                maxLen = s.length();
        }


        for (int i = 0; i < list.size(); i++) {
            String s1 = list.get(i);
            if (s1.length() == maxLen)
                System.out.println(list.get(i));

        }
    }

}
