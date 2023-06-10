package com.practice.case2;

import java.time.LocalDateTime;

//performing single task from multiple thread
public class Test extends Thread{
    @Override
    public void run() {
        System.out.println("start time "+LocalDateTime.now());
        System.out.println("test");
        for(int i=0;i<100000;i++){
            System.out.println(i+" ->"+Thread.currentThread().getName());
        }
        System.out.println("end time "+LocalDateTime.now());
    }

    public static void main(String[] args) {

        Test t1=new Test();
        t1.start();
        Test t2=new Test();
        t2.start();

    }
}
