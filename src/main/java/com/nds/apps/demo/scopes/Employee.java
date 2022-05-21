package com.nds.apps.demo.scopes;

public class Employee {
    String name;

    public void doSomething() {
        String name;
        name="something";
        System.out.println(name);
        this.name="instance name";
        System.out.println(this.name);
    }

    public void doOther(){
        String name;
        this.doSomething();
    }
}
