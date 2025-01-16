package homework_nr_21.part_2;

public class Factorial implements Runnable{
    private final int number;
    private long result;
    public long getResult(){return result;}
    public Factorial(int number) throws WrongParameterException{
        if(number < 0) throw new WrongParameterException("The number can't be negative!");
        else this.number = number;
    }
    @Override
    public void run() {
        result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        System.out.println("Factorial of " + number + " is " + result + ". Thread ID is " + Thread.currentThread().getId());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
