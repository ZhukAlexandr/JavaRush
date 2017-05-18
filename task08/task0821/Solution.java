package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Ivanov","Ivan");
        map.put("Ivanov","Pety");
        map.put("Petrov","Ivan");
        map.put("Petrov11","2Ivan7777");
        map.put("Petrov111","2Ivan9");
        map.put("Petrov1111","2Ivan97");
        map.put("Petrov11111","2Ivan7");
        map.put("Petrov111111","2Ivan7");
        map.put("Petrov1111111","2Ivan67");
        map.put("Petrov11112","2Ivan54");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
