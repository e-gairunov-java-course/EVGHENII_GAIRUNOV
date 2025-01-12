package homework_nr_20;

public class Main {
    public static void main(String[] args) {
        SharedCounter sharedCounter = new SharedCounter();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sharedCounter.increment();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sharedCounter.safeIncrement();
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\n\n-------Counter is " + sharedCounter.getCounter());
    }
}
