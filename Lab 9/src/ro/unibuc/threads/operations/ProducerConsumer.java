package ro.unibuc.threads.operations;

import java.util.LinkedList;

public class ProducerConsumer {

    LinkedList<Integer> list = new LinkedList<>();
    int capacity;

    public ProducerConsumer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int x) throws InterruptedException {
        while (list.size() == capacity) {
            wait();
        }

        list.add(x);
        System.out.println("Producer produced - " + x);

        notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        while (list.size() == 0) {
            wait();
        }

        int val = list.removeFirst();
        System.out.println("Consumer consumed - " + val);

        notifyAll();
    }
}

class MainProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer example = new ProducerConsumer(5);

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    Thread.sleep((int) (Math.random() * 100));
                    example.produce(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    Thread.sleep((int) (Math.random() * 100));
                    example.consume();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}
