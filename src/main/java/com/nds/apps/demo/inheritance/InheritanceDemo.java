package com.nds.apps.demo.inheritance;

public class InheritanceDemo {
    public static void main(String... args) {
        Human h1 = new Human();
        Human h2 = new Human();
        Human h3 = new Human();
        Human h4 = new Human();
        h1.printLegsAndTail();
        h1.walk();
        h1.noOfLegs=3;

        h1.printNoOfEyes();
        Mamals.feedMilk();
        ///
        Mamals m1=new Mamals();
        m1.noOfLegs=2;
        m1.isTailPresent=false;

        Mamals m2=new Mamals(4,true);

    }
}
