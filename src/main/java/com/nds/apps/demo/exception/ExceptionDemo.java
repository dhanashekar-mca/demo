package com.nds.apps.demo.exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        int[] ar=new int[3];
        ar[0]=5;
        ar[1]=6;
        try {
            ar[2] = 7;
        }catch (Exception ex){
            System.out.println("Exception occured");
        }finally {
            System.out.println("finally 1");
        }

        System.out.println("hello");
        int z=0;
        try {
             z = 10 / 0;
        }catch (Exception ex){
            System.out.println("Denominator can not be zero");
        }finally {
            System.out.println("finally 2");
        }

        System.out.println("z="+z);
    }
}
