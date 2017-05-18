package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list_3 = new ArrayList<Integer>();
        ArrayList<Integer> list_2 = new ArrayList<Integer>();
        ArrayList<Integer> list_another = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int x : list){
            if ((x % 2 == 0) || (x % 3 == 0)) {
                if (x % 3 == 0)
                    list_3.add(x);
                if (x % 2 == 0)
                    list_2.add(x);
            }
            else
                list_another.add(x);
        }
        printList(list_3);
        printList(list_2);
        printList(list_another);
    }

    public static void printList(List<Integer> list) {
        for(Integer x: list)
            System.out.println(x);
    }
}
