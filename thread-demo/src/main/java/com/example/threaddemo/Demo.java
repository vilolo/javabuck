package com.example.threaddemo;

import java.util.concurrent.atomic.AtomicBoolean;

class Demo<INN, OUT> {
    public Integer a = 0;
    public Integer b = 0;
    public Integer c = 0;
    private final byte[] lock = new byte[0];
    private Object lock2 = new Object();
    void test() {
        //t1();
        t2();
    }

    private void t1(){
        for (int j=0; j<100; j++){
            new Thread(()-> {
                int i = 0;
                while (i<100){
                    synchronized (lock){
                        a++;
                        b++;
                        c = a+b;
                        if (c != a+b){
                            System.out.println(c+"="+a+"+"+b);
                        }
                        i++;
                    }
                }

            }).start();
        }
    }

    private void t2() {
        M1 m1 = new M1();
        new Thread(()->{
            m1.testWait();
        }).start();

        new Thread(()->{
            m1.testNotifyAll();
        }).start();
    }
}

class M1{
    private final Object lock = new Object();

    void testWait() {
        synchronized (lock){
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            AtomicBoolean b = new AtomicBoolean(true);
            System.out.println(b.compareAndSet(false, true)?"ok":"err");
            System.out.println("wait !!!");
        }

        new Thread(()->{
            while (true){
                System.out.println("bbbbb");
            }
        }).start();

    }

    void testNotifyAll(){
        synchronized (lock){
            System.out.println("doing notify!!!!");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.notifyAll();
        }
    }
}
