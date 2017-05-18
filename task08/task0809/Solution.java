package com.javarush.task.task08.task0809;

import java.util.*;

/* 
Время для 10 тысяч вставок
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }

    public static long getTimeMsOfInsert(List list) {

        Calendar date_before = GregorianCalendar.getInstance();
        insert10000(list);
        Calendar date_after = GregorianCalendar.getInstance();
        return date_after.getTimeInMillis() - date_before.getTimeInMillis();

        //напишите тут ваш код

    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
