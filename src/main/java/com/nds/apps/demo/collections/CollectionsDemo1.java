package com.nds.apps.demo.collections;

import java.util.*;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        List<Integer> intList=new ArrayList<>();
      intList.add(3);
      intList.add(5);
      intList.add(8);
      //
        intList.add(66);
        intList.get(0);
        for(int i=0;i<intList.size();i++){
            System.out.println(intList.get(i));
        }

        for(Integer x:intList){
            System.out.println(x);
        }

        Iterator<Integer> it=intList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        //Set
        Set<String> strSet=new HashSet<>();
        strSet.add("Rama");
        strSet.add("Rama");
        strSet.add("Lakshmana");
        strSet.add("Lakshmana");
        strSet.add("Bharatha");
        strSet.add("Shathrugna");

        for (String s : strSet) {
            System.out.println(s);
        }

        Iterator<String> it1=strSet.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }

    }
}
