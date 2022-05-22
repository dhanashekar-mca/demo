package com.nds.apps.demo.collections;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a1=new int[4];
        a1[0]=3;
        a1[1]=8;
        a1[2]=6;
        a1[3]=7;
        for (int x:a1) {
            System.out.println("value="+x);
        }
        for(int i=0;i<a1.length;i++){
            System.out.println("value="+a1[i]);
        }
    }
}
