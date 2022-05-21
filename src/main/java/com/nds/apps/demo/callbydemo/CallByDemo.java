package com.nds.apps.demo.callbydemo;

public class CallByDemo {
    public static void main(String[] args) {
        CEmployee e1=new CEmployee();
        int input=100;
        int returnedSalary1=e1.doSomething(input);
        System.out.println("returned Salary="+returnedSalary1);
        System.out.println("input variable="+input);
        System.out.println("------------------------------------------------------------------------------------------");

       
    }
}
