package com.demo.api.interviews.threads;

// if two threads are waiting for each other forever

// The only reason deadLock happens because of synchronized

public class DeadLockDemo implements Runnable {

    A a = new A();
    B b = new B();

    DeadLockDemo() {

        Thread t = new Thread(this);
        t.start();
        a.foo(b);
    }

    public static void main(String[] args) {

        new DeadLockDemo();
    }

    @Override
    public void run() {

        b.bar(a);
    }
}

class B {

    public synchronized void bar(A a) {

        System.out.println("Thread1 start execution of bar() method");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread1 trying to call A.last() method");

        a.last();
    }

    public synchronized void last() {

        System.out.println("Inside A, this is last() method");

    }
}

class A {

    public synchronized void foo(B b) {

        System.out.println("Thread2 start execution of bar() method");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread2 trying to call B.last() method");

        b.last();
    }

    public synchronized void last() {

        System.out.println("Inside B, this is last() method");

    }
}