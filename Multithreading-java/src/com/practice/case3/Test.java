package com.practice.case3;

class Thread1 extends Thread{
    @Override
    public void run() {
        System.out.println("task1 "+Thread.currentThread().getName());
    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        System.out.println("task2 "+Thread.currentThread().getName());
    }
}
public class Test {
    public static void main(String[] args) {
      Thread1 t1=new Thread1();
      t1.start();
      Thread2 t2=new Thread2();
      t2.start();
    }
}
