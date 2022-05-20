package com.nds.apps.demo.abstraction.interfaces;

public  class ITiger implements IAnimal{

    @Override
    public void run() {
        System.out.println("Tiger runs");
    }

    public String getAnimalName(){
        return "Tiger";
    }
}
