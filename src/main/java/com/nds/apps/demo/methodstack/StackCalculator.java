package com.nds.apps.demo.methodstack;

public class StackCalculator {
    public int calculate(int a,int b){
        int x=a*10;
        int y=b-2;
        int z=sum(a,b);
        return z+x+y;
    }

    public int sum(int a, int b){
        int x=a+b;
        return x;
    }

    public int doSum(int k){
        if(k>0){
            return k+doSum(k-1);
        }else{
            return 0;
        }
    }
}
