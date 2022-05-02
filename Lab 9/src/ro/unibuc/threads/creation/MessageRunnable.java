package ro.unibuc.threads.creation;

public class MessageRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from another thread " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Begin main");

        Thread helloRunnable = new Thread(new MessageRunnable());
//        helloRunnable.setName("Runnable-test");

        helloRunnable.start();
//        helloRunnable.run();

        System.out.println("End main!");
    }
}
