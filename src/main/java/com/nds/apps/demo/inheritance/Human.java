package com.nds.apps.demo.inheritance;

public class Human extends Mamals{

    boolean canSpeak;

    public Human() {
        super(2, false);
    }

    public void printLegsAndTail(){
        System.out.println("Legs for Humans="+noOfLegs);
        System.out.println("Humans have tail is " +isTailPresent);
    }

    public void speak(){
        System.out.println("Speak");
    }

    public void printNoOfEyes(){
        System.out.println("No. of Eyes for Humans is ="+Mamals.EYES);
        Mamals.istailpresent();
    }
}
