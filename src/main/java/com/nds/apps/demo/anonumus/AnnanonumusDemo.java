package com.nds.apps.demo.anonumus;

public class AnnanonumusDemo {
    public static void main(String[] args) {
        // SampleInterface si=new SampleInterface() ; //not allowd
        // SampleAbstract sa=new SampleAbstract() ; //not allowed

        SampleInterface sampleInterface = new SampleInterface() {
            @Override
            public void doSomething() {
                System.out.println("doing something");
            }
        };

        sampleInterface.doSomething();

        //Abstract class
            SampleAbstract sampleAbstract=new SampleAbstract() {
                @Override
                public void doThis(){
                    System.out.println("doing This");
                }
            };

            sampleAbstract.doThis();
            sampleAbstract.printHello();

            MyClass myClass=new MyClass();
    }
}
