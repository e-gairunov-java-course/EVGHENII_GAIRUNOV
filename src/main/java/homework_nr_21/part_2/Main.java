package homework_nr_21.part_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        try {
            threadPool.submit(new Factorial(5));
            threadPool.submit(new Factorial(15));
            threadPool.submit(new Factorial(20));
            threadPool.submit(new Factorial(18));
            threadPool.submit(new Factorial(10));
        } catch (WrongParameterException e) {
            System.out.println(e.getMessage());
        }
        threadPool.shutdown();
    }
}
