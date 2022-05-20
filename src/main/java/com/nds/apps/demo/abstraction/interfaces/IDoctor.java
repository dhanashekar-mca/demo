package com.nds.apps.demo.abstraction.interfaces;

public class IDoctor {

    public void doTreatment(IAnimal animal){
        System.out.println("treating "+animal.getAnimalName());
    }
}
