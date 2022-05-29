package com.nds.apps.demo.methodstack;

public class MethodStackDemo {
     public static void main(String[] args) {
        StackCalculator sc=new StackCalculator();
        int result=sc.calculate(2, 5);
        System.out.println("result="+result);
        System.out.println(sc);
        System.out.println(sc.doSum(5));
    }
}
