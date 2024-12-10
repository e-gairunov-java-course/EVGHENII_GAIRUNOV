package homework_nr_15;

public class Pair<T,U> {

    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair<>("Hello",42);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        Pair<String, Boolean> pair1 = new Pair<>("Java",true);
        System.out.println(pair1.getFirst() + "\t" + pair1.getSecond());
    }
}
