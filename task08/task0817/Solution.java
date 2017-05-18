package com.javarush.task.task08.task0817;

import javax.print.attribute.standard.MediaSize;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++){
            map.put("Иванов" + i, "Иван" + i);
        }
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashSet<String> Name = new HashSet<>();
        HashSet<String> DuplicatesName = new HashSet<>();

        for(Map.Entry<String, String> pair: map.entrySet()){
            if ((Name.contains(pair.getValue())) && !(DuplicatesName.contains(pair.getValue())))
            DuplicatesName.add(pair.getValue());
            Name.add(pair.getValue());
        }

        for (String s : DuplicatesName)
            removeItemFromMapByValue(map, s);

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
