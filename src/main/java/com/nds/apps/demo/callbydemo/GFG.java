package com.nds.apps.demo.callbydemo;
// Java program to make a particular variable
// of a particular datatype as a class member

import java.io.*;

public class GFG {
    int Number;
    void GFG()
    { Number = 0; }

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
