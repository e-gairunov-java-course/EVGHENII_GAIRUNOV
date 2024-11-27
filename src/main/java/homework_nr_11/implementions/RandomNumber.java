package homework_nr_11.implementions;

import java.util.function.Supplier;

public class RandomNumber implements Supplier<Double> {
    @Override
    public Double get() {
        return Math.random();
    }
}
