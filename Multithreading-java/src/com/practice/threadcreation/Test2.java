package com.practice.threadcreation;

public class Test2 implements Runnable{
    @Override
    public void run() {
        System.out.println("task 1 "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Test2 t=new Test2();
        System.out.println("main method "+Thread.currentThread().getName());
        Thread th=new Thread(t);
        th.start();
        System.out.println("main method "+Thread.currentThread().getName());
    }
}
