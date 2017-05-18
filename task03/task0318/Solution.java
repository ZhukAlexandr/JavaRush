package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String sAge = reader1.readLine();
        String name = reader1.readLine();

        int age = Integer.parseInt(sAge);
        System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");
    }
}