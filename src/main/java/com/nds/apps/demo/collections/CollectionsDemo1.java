package com.nds.apps.demo.collections;

import java.util.*;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(5);
        intList.add(8);
        //
        intList.add(66);
        intList.get(0);
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }

        for (Integer x : intList) {
            System.out.println(x);
        }

        Iterator<Integer> it = intList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        //Set
        Set<String> strSet = new HashSet<>();
        strSet.add("Rama");
        strSet.add("Rama");
        strSet.add("Lakshmana");
        strSet.add("Lakshmana");
        strSet.add("Bharatha");
        strSet.add("Shathrugna");

        for (String s : strSet) {
            System.out.println(s);
        }

        Iterator<String> it1 = strSet.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        Map<String, String> map = new HashMap<>();
        map.put("one", "jan");
        map.put("two", "feb");
        map.put("three", "March");

        String v1 = map.get("two");
        System.out.println(v1);

        Set<String> keySet = map.keySet();

        Iterator<String> it3 = keySet.iterator();
        while (it3.hasNext()) {
            String key = it3.next();
            String value = map.get(key);
            System.out.println("key=" + key + " value=" + value);
        }

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> it4 = entrySet.iterator();
        while (it4.hasNext()) {
            Map.Entry entry = it4.next();
            System.out.println("key=" + entry.getKey() + " value=" + entry.getValue());
        }

    }
}
