package homework_nr_17;

import java.util.LinkedList;
import java.util.List;

public class Storage<T> {
    private final List<T> itemList;

    public Storage(List<T> itemList) {
        this.itemList = itemList;
    }

    public Storage() {
        this.itemList = new LinkedList<>();
    }

    public void addItem(T item){
        itemList.add(item);
    }

    public List<T> getItems(){
        return itemList.stream().toList();
    }
}
