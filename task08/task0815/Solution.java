package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов","Иван");
        map.put("Петров","Иван");
        map.put("Сидоров","ФЫВА");
        map.put("Полетаев","Шажя");
        map.put("Баклажанов","Вудя");
        map.put("Помидоров","Мудя");
        map.put("Жуков","Мудя");
        map.put("Василевь","Дудя");
        map.put("Рыжиков","Фудя");
        map.put("жук","фуфв");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int a = 0;
        for (Map.Entry<String, String> pair: map.entrySet())
            if(pair.getValue().equals(name))
                a++;
        return a;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;

        Iterator<Map.Entry<String , String >> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry entry = it.next();
            if(entry.getKey().equals(lastName))
                count++;

        }
        return count;

    }

    public static void main(String[] args) {

    }
}
