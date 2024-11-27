package homework_nr_11.implementions;

import java.util.function.Predicate;

public class OddTest implements Predicate<Integer> {
    @Override
    public boolean test(Integer i) {
        return i % 2 == 1;
    }
}
