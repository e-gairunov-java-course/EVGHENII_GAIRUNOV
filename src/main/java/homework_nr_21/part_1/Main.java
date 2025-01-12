package homework_nr_21.part_1;

public class Main {

    public static void main(String[] args) {
        SharedBuffer sharedBuffer = new SharedBuffer();
        Thread producerThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                sharedBuffer.produce(i);
            }
            System.out.println("Producer finished.");
        });
        Thread consumerThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                sharedBuffer.consume();
            }
            System.out.println("Consumer finished.");
        });

        producerThread.start();
        consumerThread.start();
        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Buffer value is " + sharedBuffer.getBuffer());
    }
}