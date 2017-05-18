package com.javarush.task.task08.task0810;

import java.util.*;

/* 
Время для 10 тысяч вызовов get
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfGet(fill(new ArrayList())));
        System.out.println(getTimeMsOfGet(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getTimeMsOfGet(List list) {
        Calendar date_before = GregorianCalendar.getInstance();
        get10000(list);
        Calendar date_after = GregorianCalendar.getInstance();

        return date_after.getTimeInMillis() - date_before.getTimeInMillis();
        //напишите тут ваш код

    }

    public static void get10000(List list) {
        if (list.isEmpty()) return;
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}
