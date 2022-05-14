package ro.unibuc.threads.creation;

public class MessageThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from thread " + Thread.currentThread().getName());
    }

}

class MainThread {

    public static void main(String[] args) {
        System.out.println("Begin main");

        MessageThread helloThread = new MessageThread();
//        helloThread.setName("Thread-test");

        helloThread.start();
//        helloThread.run();

        System.out.println("End main");
    }

}
