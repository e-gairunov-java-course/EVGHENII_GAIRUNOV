package homework_nr_19;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        FirstTread firstThread = new FirstTread();
        Thread secondThread = new Thread(() -> {
            System.out.println(9);
            try {
                Thread.sleep(1000);
                System.out.println(7);
                Thread.sleep(1000);
                System.out.println(5);
                Thread.sleep(1000);
                System.out.println(3);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread " + Thread.currentThread().getName() + " is interrupted.");
                return;
            }
            System.out.println(1);
        });
        firstThread.start();
        secondThread.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //firstThread.interrupt();
        secondThread.interrupt();
    }
}

class FirstTread extends Thread{
    public void run(){
        System.out.println(0);
        try {
            Thread.sleep(1000);
            System.out.println(2);
            Thread.sleep(1000);
            System.out.println(4);
            Thread.sleep(1000);
            System.out.println(6);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is interrupted.");
            return;
        }
        System.out.println(8);
    }
}
