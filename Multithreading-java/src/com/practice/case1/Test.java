package com.practice.case1;

//performing single task from single thread
public class Test extends Thread{
    @Override
    public void run() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.start();
    }
}
