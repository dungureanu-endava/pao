package ro.unibuc.threads.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static ro.unibuc.threads.operations.RaceConditionExample.list;

class ProducerTask implements Runnable {

    @Override
    public void run() {
        Random random = new Random();

        while (true) {
            synchronized (list) {
                if (list.size() < 20) {
                    int number = random.nextInt(100);
                    list.add(number);

                    System.out.println(Thread.currentThread().getName() + " has added " + number);

                    list.notifyAll();
                } else {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("The list already has 20 elements.");
                }
            }
        }
    }
}

class ConsumerTask implements Runnable {

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                if (!list.isEmpty()) {
                    int number = list.get(0);
                    list.remove(0);

                    System.out.println(Thread.currentThread().getName() + " has removed " + number);

                    list.notifyAll();
                } else {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

public class RaceConditionExample {

    public static final List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new ProducerTask());
        executorService.submit(new ConsumerTask());
        executorService.submit(new ProducerTask());
        executorService.submit(new ConsumerTask());
    }
}
