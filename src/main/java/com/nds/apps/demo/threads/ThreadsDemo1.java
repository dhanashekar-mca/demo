package com.nds.apps.demo.threads;

public class ThreadsDemo1 {
    public static void main(String[] args) {
        MyThread1 mt1=new MyThread1();
        MyRunnable runnable1=new MyRunnable();
        Thread mt2=new Thread(runnable1);
        //mt1.setPriority(3);

        mt1.start();
        mt2.start();
    }
}
