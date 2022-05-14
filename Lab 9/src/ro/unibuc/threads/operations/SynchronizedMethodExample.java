package ro.unibuc.threads.operations;

public class SynchronizedMethodExample implements Runnable {

    private Integer count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            increment();
        }
    }

    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + "::" + count);
    }

    public static void main(String[] args) {
        SynchronizedMethodExample counter = new SynchronizedMethodExample();

        Thread thread1 = new Thread(counter);
        Thread thread2 = new Thread(counter);

        thread1.start();
        thread2.start();
    }

}

