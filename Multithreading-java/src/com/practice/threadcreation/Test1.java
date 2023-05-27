package com.practice.threadcreation;

public class Test1 extends Thread{
    @Override
    public void run() {
        System.out.println("task 1 "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Test1 t=new Test1();
        System.out.println("main method "+Thread.currentThread().getName());
        t.start();
        System.out.println("main method "+Thread.currentThread().getName());
    }
}
