package com.nds.apps.demo.abstraction.interfaces;

public class ILion implements IAnimal{
    @Override
    public void run() {
        System.out.println("Lion Runs");
    }

    @Override
    public String getAnimalName() {
        return "Lion";
    }
}
