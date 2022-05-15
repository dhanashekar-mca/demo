package com.nds.apps.demo.tstatic;

public class StaticDemo {
    public static void main(String... args){
        StaticClass s1=new StaticClass();
        StaticClass s2=new StaticClass();
        StaticClass s3=new StaticClass();

        s1.x=2;
        System.out.println(s1.x);
        s2.x=5;

        System.out.println("s1x= "+s1.x+" s2x="+s2.x);
        s1.y=5;
        System.out.println("s1 y="+s1.y);
        s2.y=9;
        System.out.println("s2 y="+s2.y);
        System.out.println("s1 y="+s1.y);
        System.out.println("y= "+StaticClass.y);
        StaticClass.y=10;
        System.out.println("y= "+StaticClass.y);
        System.out.println("s1 y="+s1.y);
        System.out.println("s2by="+s2.y);

        StaticClass.doSomething();
    }
}
