package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        ArrayList<String> list = new ArrayList<>();
        while (true){
            str = reader.readLine();
            if ("end".equals(str))
                break;
            else
                list.add(str);
        }
        for (String x: list)
            System.out.println(x);
    }
}