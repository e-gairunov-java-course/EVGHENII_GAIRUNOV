package homework_nr_12;

import java.util.function.Predicate;

public enum CheckInteger {
    CHECK_IF_ODD((p) -> (p % 2) != 0),
    CHECK_IF_EVEN((p) -> (p % 2) == 0),
    CHECK_IF_NEGATIVE((p) -> p < 0),
    CHECK_IF_POSITIVE((p) -> p > 0);

    final Predicate<Integer> prd;
    boolean test(Integer i){return this.prd.test(i);}

    CheckInteger(Predicate<Integer> prd){this.prd = prd;}
}
