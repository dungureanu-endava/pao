package ro.unibuc.threads.operations;

public class SynchronizedBlock implements Runnable {
    private Integer count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            increment();
        }
    }

    public void increment() {
        synchronized (this) {
            count++;
            System.out.println(Thread.currentThread().getName() + "::" + count);
        }

        System.out.println("!" + Thread.currentThread().getName() + "::" + count);
    }

    public static void main(String[] args) {
        SynchronizedBlock counter = new SynchronizedBlock();

        Thread thread1 = new Thread(counter, "ONE");
        Thread thread2 = new Thread(counter, "TWO");

        thread1.start();
        thread2.start();
    }
}
