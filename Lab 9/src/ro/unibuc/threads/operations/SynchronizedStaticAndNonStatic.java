package ro.unibuc.threads.operations;

public class SynchronizedStaticAndNonStatic {

    public synchronized static void staticLock(int n) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + n * i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void objLock(int n) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + n * i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread1 extends Thread {

    public void run() {
//        SynchronizedStaticAndNonStatic.staticLock(1);
        new SynchronizedStaticAndNonStatic().objLock(1);
    }
}

class MyThread2 extends Thread {

    public void run() {
//        SynchronizedStaticAndNonStatic.staticLock(10);
        new SynchronizedStaticAndNonStatic().objLock(10);
    }
}

class MyThread3 extends Thread {

    public void run() {
//        SynchronizedStaticAndNonStatic.staticLock(100);
        new SynchronizedStaticAndNonStatic().objLock(100);
    }
}


class MyThread4 extends Thread {

    public void run() {
//        SynchronizedStaticAndNonStatic.staticLock(1000);
        new SynchronizedStaticAndNonStatic().objLock(1000);
    }
}

class Main {

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();
        MyThread4 t4 = new MyThread4();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
