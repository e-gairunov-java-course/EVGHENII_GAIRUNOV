package homework_nr_20;

public class SharedCounter {
    private volatile int counter;
    private final Object lock = new Object();
    public synchronized void increment(){
        counter++;
        System.out.println(counter + " <-- increment()");
    }
    public int getCounter(){
        return counter;
    }
    public void safeIncrement(){
        synchronized (lock){counter++;}
        System.out.println(counter + " <--safeIncrement()");
    }
}
