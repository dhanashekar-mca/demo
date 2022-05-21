package com.nds.apps.demo.callbydemo;

public class GFG {
    int Number;
     GFG()
    { Number = 2; }

    static void update(GFG ob)
    {
        ob.Number++;
    }

    public static void main(String[] args)
    {
        GFG ob = new GFG();

        System.out.println("Number value " + (ob.Number));

        update(ob);

        System.out.println("Updated Number value "
                + (ob.Number));
    }
}
