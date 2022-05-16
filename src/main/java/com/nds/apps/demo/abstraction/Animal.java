package com.nds.apps.demo.abstraction;

public abstract class Animal {
    int noOfLegs;

    public abstract void eatingType();

    public void run(){
        System.out.println("Run...");
    }
}
