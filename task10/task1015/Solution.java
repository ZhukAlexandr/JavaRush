package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] listOfLists = new ArrayList[10];

        for (int i = 0; i < 10; i++) {
            listOfLists[i] = new ArrayList<>();
            List list = Arrays.asList("Товарищ", "верь"); // в скобках через запятую заполняете список
            listOfLists[i].addAll(list);

        }
        return listOfLists;
    }


    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}