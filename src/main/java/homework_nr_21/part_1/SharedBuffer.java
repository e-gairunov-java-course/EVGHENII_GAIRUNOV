package homework_nr_21.part_1;

public class SharedBuffer {
    private volatile int buffer = 5;
    private volatile boolean isEmpty;

    public int getBuffer(){
        return buffer;
    }

    public synchronized void produce(int value){
        while(!isEmpty){
            System.out.println("Producer can't be done. The buffer isn't empty.");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        buffer = value;
        isEmpty = false;
        System.out.println("Producer successfully done. Was stored value " + buffer);
        notifyAll();
    }
    public synchronized void consume(){
        while(isEmpty){
            System.out.println("Consumer can't be done. The buffer is empty.");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isEmpty = true;
        System.out.println("Consumer successfully done. The value is " + buffer);
        notifyAll();
    }
}
