package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        while (true) {
            String s = reader.readLine();
            if(!s.isEmpty()){
                String i = Integer.parseInt(reader.readLine());
                map.put(S, );
            }
            else
                break;

            int id = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
        }

        for (Map.Entry<String, Integer> entry: map.entrySet())
        System.out.println("Id=" + entry.getValue() + " Name=" + entry.getKey());
    }
}
