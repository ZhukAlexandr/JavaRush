package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String>  vegetables = new HashSet<String>();
        vegetables.add("арбуз");
        vegetables.add("банан");
        vegetables.add("вишня");
        vegetables.add("груша");
        vegetables.add("дыня");
        vegetables.add("ежевика");
        vegetables.add("жень-шень");
        vegetables.add("земляника");
        vegetables.add("ирис");
        vegetables.add("картофель");
        Iterator<String> inetarot = vegetables.iterator();
        while (inetarot.hasNext())
            System.out.println(inetarot.next());
        for(String veg: vegetables)
            System.out.println(veg);

    }
}
