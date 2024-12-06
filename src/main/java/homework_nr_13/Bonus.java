package homework_nr_13;

import java.util.*;

public class Bonus {
    public static List<String> createStringList(int count){
        String[] strings = new String[count];
        if(count < 1) return null;
        for(int i = 0; i < count; i++){
            int length = (int) (20 * Math.random());
            char[] arr = new char[length];
            for(int j = 0; j < length; j++)
                arr[j] = (char)(('z' - 'a') * Math.random() + 'a');
            strings[i] = new String(arr);
        }
        return new ArrayList<>(Arrays.asList(strings));
    }

    public static void main(String[] args) {
        List<List<String>> nestedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nestedList.add(createStringList((int)(7 * Math.random() + 1)));
        }
        System.out.println("\nPrinting lists:");
        for(List<String> list : nestedList){
            System.out.println(list);
        }
        System.out.println("\nPrinting nested list:");
        System.out.println(nestedList);
        System.out.println("\nPrinting flatted list:");
        System.out.println(nestedList.stream().flatMap(Collection::stream).toList());
    }
}
