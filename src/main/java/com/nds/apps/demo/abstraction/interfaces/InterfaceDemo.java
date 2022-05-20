package com.nds.apps.demo.abstraction.interfaces;

public class InterfaceDemo {
    public static void main(String... args){
        ITiger t1=new ITiger();
        t1.run();

        IAnimal a1=new ITiger();
        a1.run();

        IDoctor d1=new IDoctor();
        d1.doTreatment(t1);

        ILion l1=new ILion();
        d1.doTreatment(l1);
    }
}
