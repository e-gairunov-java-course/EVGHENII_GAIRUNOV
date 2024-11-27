package homework_nr_11.implementions;

import java.util.function.Consumer;

public class ShowString implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
