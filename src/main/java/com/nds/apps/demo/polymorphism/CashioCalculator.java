package com.nds.apps.demo.polymorphism;

public class CashioCalculator extends CalculatorPoly{

    public int sub(int x1, int x2){
        int y=x1-x2;
        return y;
    }

    @Override
    public int add(int a,int b){
        int x=a+b;
        System.out.println("CashioCalculator method result="+x);
        return x;
    }
}
