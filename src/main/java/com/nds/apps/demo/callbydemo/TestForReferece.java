package com.nds.apps.demo.callbydemo;

public final class TestForReferece {
    int Number;

    public TestForReferece() {
        Number = 3;
    }

    static void update(TestForReferece ob) {ob.Number++;
    }

    public static void main(String[] args) {
        TestForReferece ob = new TestForReferece();
String str=new String("jlasdjlajslfj");
        System.out.println("Number value " + (ob.Number));
//comments
        /*
        sdjkflasjflas
        jldsfalfjals

         */
        update(ob);

        System.out.println("Updated Number value "
                + (ob.Number));
    }
}
