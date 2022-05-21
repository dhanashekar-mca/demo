package com.nds.apps.demo.callbydemo;

public class CEmployee {
    String name;

   public int doSomething(int salary){
       System.out.println("input salary="+salary);
       salary=salary+1;
       return salary;
   }


    public Integer doSomething1(Integer salary){
        System.out.println("input salary="+salary);
        salary=salary+1;
        return salary;
    }
}
