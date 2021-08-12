package com.codegymhueJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

    public static void main(String[] args) {
        Map<String, Integer>hashMap = new HashMap<>();
        hashMap.put("hoang",21);
        hashMap.put("hoa",31);
        hashMap.put("phuong",23);
        hashMap.put("chuong",37);

        System.out.println("Display HashMap : ");
        System.out.println(hashMap + " ");


        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));



    }
}
