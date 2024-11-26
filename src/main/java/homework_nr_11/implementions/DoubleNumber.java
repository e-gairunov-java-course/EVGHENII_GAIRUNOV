package homework_nr_11.implementions;

import java.util.function.Function;

public class DoubleNumber implements Function<Double,Double> {
    @Override
    public Double apply(Double aDouble) {
        return aDouble * 2;
    }
}
