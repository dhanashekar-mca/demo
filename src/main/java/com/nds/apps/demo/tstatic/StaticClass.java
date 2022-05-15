package com.nds.apps.demo.tstatic;

public class StaticClass {
    public int x;
    public static int y;

    public StaticClass(){
    }

    public StaticClass(int z){
        this.x=z;
    }

    public static void doSomething(){
        System.out.println("Doing something.....");
    }

    public static void workSoemthing(){
        System.out.println("WorkSomething......");
    }
}
