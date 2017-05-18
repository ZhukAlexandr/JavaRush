package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        int maxLen = list.get(0).length();
        int minLen = list.get(0).length();

        for (int i = 0; i < list.size() ; i++) {
            if (maxLen < list.get(i).length())
                maxLen = list.get(i).length();

            if(minLen > list.get(i).length())
                minLen = list.get(i).length();
        }

        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).length() == maxLen) || (list.get(i).length() == minLen)) {
                System.out.println(list.get(i));
                break;
            }
        }
    }
}
