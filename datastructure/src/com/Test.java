package com;

public class Test {

    public static void main(String[] args) {
        MySync mySync = new MySync(1);

        Thread t1 = new Thread(() -> {
            mySync.print();
        }, "t1");

        Thread t2 = new Thread(() -> {
            mySync.print();
        }, "t2");

        t1.start();
        t2.start();
    }

}


class MySync {
    private int flag;

    public MySync(int flag) {
        this.flag = flag;
    }

    public synchronized void print() {
        while (flag < 100) {
            Thread thread = Thread.currentThread();
            String name = thread.getName();
            if (name.equals("t1")) {
                while (flag % 2 != 1) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                while (flag % 2 != 0) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println(name + "==>" + flag);
            flag++;
            this.notify();
        }
    }
}
