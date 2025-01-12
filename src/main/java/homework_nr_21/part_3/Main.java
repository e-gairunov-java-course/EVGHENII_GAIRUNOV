package homework_nr_21.part_3;

import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        Random random = new Random();

        for(int i = 0; i < 100; i++){
            concurrentLinkedQueue.offer(random.nextInt(1, 10));
        }

        Runnable task = () -> {
            Integer poolingInteger;
            while(!concurrentLinkedQueue.isEmpty()){
                poolingInteger = concurrentLinkedQueue.poll();
//                System.out.println("\n------Thread ID is " + Thread.currentThread().getId());
                System.out.println("Double of polling value " + poolingInteger + " is " + poolingInteger * 2);
            }
        };

        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        int threadsNumber = random.nextInt(3,10);
        for (int i = 0; i < threadsNumber; i++){
            while(!concurrentLinkedQueue.isEmpty())threadPool.submit(task);
        }
        threadPool.shutdown();
        System.out.println("\n\nJob is successfully done.");
    }
}
