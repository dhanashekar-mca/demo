package com.nds.apps.demo.callbydemo;

public class TestForReferece {
    int Number;

    public TestForReferece() {
        Number = 3;
    }

    static void update(TestForReferece ob) {ob.Number++;
    }

    public static void main(String[] args) {
        TestForReferece ob = new TestForReferece();

        System.out.println("Number value " + (ob.Number));

        update(ob);

        System.out.println("Updated Number value "
                + (ob.Number));
    }
}
