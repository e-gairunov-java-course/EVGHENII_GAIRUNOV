package homework_nr_17;

import java.util.Arrays;

public class Warehouse<T> {
    Storage<Storage<T>> storages = new Storage<>();

    public void addStorage(Storage<T> storage){
        this.storages.addItem(storage);
    }

    public long allObjectsNumber(){
        return storages.getItems().stream()
                .flatMap(e -> e.getItems().stream())
                .count();
    }

    public static void main(String[] args) {
        Warehouse<Integer> warehouse = new Warehouse<>();
        Storage<Integer> storage0 = new Storage<>(Arrays.asList(1, 2, 3, 4, 5));
        Storage<Integer> storage1 = new Storage<>(Arrays.asList(2, 3, 4, 5, 6));
        Storage<Integer> storage2 = new Storage<>(Arrays.asList(3, 4, 5, 6, 7));
        Storage<Integer> storage3 = new Storage<>(Arrays.asList(4, 5, 6, 7, 8));
        Storage<Integer> storage4 = new Storage<>(Arrays.asList(5, 6, 7, 8, 9));
        warehouse.addStorage(storage0);
        warehouse.addStorage(storage1);
        warehouse.addStorage(storage2);
        warehouse.addStorage(storage3);
        warehouse.addStorage(storage4);

        System.out.println(warehouse.allObjectsNumber());
    }
}
