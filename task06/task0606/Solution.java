package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even = 0;
    public static int odd = 0;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = reader.readLine();
        for (int i = 0; i < sNum.length(); i++){
            if ((int)(sNum.charAt(i)) % 2 == 0) {
                even++;
            }
            else
                odd ++;
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
