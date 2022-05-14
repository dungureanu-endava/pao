package ro.unibuc.threads.creation;

public class MessageRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from another thread " + Thread.currentThread().getName());
    }

}

class MainRunnable {

    public static void main(String[] args) {
        System.out.println("Begin main");

        var runnableExample = new MessageRunnable();
        Thread helloRunnable1 = new Thread(runnableExample);
//        Thread helloRunnable2 = new Thread(runnableExample);

        helloRunnable1.setName("Runnable-test");

        helloRunnable1.start();
//        helloRunnable1.run();

        System.out.println("End main!");
    }

}
