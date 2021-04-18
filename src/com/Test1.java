package com;

public class Test1 implements Runnable{

    public static void main(String[] args) {
        Test1 t1=new Test1();
        Thread t=new Thread(t1);
        t.start();
        for (int i = 1; i <=10 ; i++) {
            System.out.println("执行了主线程第"+i+"次");
        }
        System.out.println("主线程执行完毕！！！");

    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("执行了子线程第"+i+"次");
        }
        System.out.println("子线程执行完毕！！！");
    }
}
