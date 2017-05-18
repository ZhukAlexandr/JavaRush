package com.javarush.task.task08.task0827;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date date2 = new Date(date);
        Date date1 = new Date();
        date1.setYear(date2.getYear());
        date1.setMonth(0);
        date1.setDate(0);
        double res = date2.getTime() - date1.getTime();
        res = res/1000/60/60/24;
        res = res - res%1;
        return (res%2==0?true:false);

    }
}
