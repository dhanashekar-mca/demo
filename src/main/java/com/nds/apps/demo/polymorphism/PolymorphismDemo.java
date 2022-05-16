package com.nds.apps.demo.polymorphism;

public class PolymorphismDemo {
    public static void main(String... args) {
        CalculatorPoly calculatorPoly = new CalculatorPoly();
        int x = calculatorPoly.add(4, 5);
        int y = calculatorPoly.add(2, 3, 5);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        //Overriding
        CashioCalculator cashioCalculator =new CashioCalculator();
        int subResult1=cashioCalculator.sub(5,3);
        System.out.println("substracted result=" + subResult1);

        cashioCalculator.add(2,8);

        CalculatorPoly calculatorPoly1=new CashioCalculator();
       // calculatorPoly1.sub(4,2); --- this is not allowd as the reference calculatorPoly1 is CalculatorPoly type
        calculatorPoly1.add(4,7); // in this case add() method is overrided in CashioCalculator so super calass refrece will call the sub class method

    }
}
