package com.nds.apps.demo.threads;

public class MyThread1 extends Thread{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Thread1="+i);
        }

    }
}
