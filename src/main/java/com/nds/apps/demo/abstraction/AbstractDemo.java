package com.nds.apps.demo.abstraction;

public class AbstractDemo {
    public static void main(String... args) {
        // Animal a=new Animal() ; --- we can not instantiate Abstract class directly
        Tiger tiger = new Tiger();
        tiger.eatingType();
        tiger.run();

        Human h=new Human();
        h.eatingType();h.run();
    }
}

