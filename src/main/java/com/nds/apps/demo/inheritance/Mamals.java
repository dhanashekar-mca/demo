package com.nds.apps.demo.inheritance;

public class Mamals {
     int noOfLegs;
    Boolean isTailPresent;
    static final int EYES = 2;

    public Mamals() {

    }

    public Mamals(int noOfLegs, Boolean isTailPresent) {
        this.isTailPresent = isTailPresent;
        this.noOfLegs = noOfLegs;
    }

    public void walk() {
        System.out.println("walk");
    }

    public void run() {
        System.out.println("Run");
    }

    public static void feedMilk(){
        System.out.println("Feeding Milk.......");
    }
    public static void istailpresent() {
        System.out.println("No");
    }
}

