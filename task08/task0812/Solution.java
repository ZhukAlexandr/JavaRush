package com.javarush.task.task08.task0812;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer>  list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int posled = 1;
        int posled_max = 1;
        for (int i = 0; i < 9; i++) {
            if(list.get(i) == list.get(i + 1))
            {
                posled++;
                if(i == 8)
                    if(posled_max < posled) {
                        posled_max = posled;
            }

            else if(posled >= 1)  {
                if(posled_max < posled) {
                    posled_max = posled;

                }

            }
                posled = 1;
        }

            System.out.println(posled_max);
        }
    }
}


