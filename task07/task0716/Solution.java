package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        ArrayList<String> list1 = new ArrayList<>();
        for (String x: list)
            if ((x.indexOf("р") < 0) &&(x.indexOf("л") >= 0)) {
                list1.add(x);
                list1.add(x);
            }
            else if ((x.indexOf("р") >= 0) &&(x.indexOf("л") >= 0))
                list1.add(x);
            else if (x.indexOf("р") < 0)
                list1.add(x);

            list = list1;
            return list1;
    }
}