package homework_nr_17;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class FilterUtils {
    public static <T> List<T> filter(List<T> items, Predicate<T> predicate){
        return items.stream().filter(predicate).toList();
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Tesla",2023);
        Vehicle v2 = new Vehicle("Ford",2022);
        Vehicle v3 = new Vehicle("BMW",2021);
        Vehicle v4 = new Vehicle("Opel",2020);
        Vehicle v5 = new Vehicle("VW",2019);
        Vehicle v6 = new Vehicle("Renault",2018);
        Vehicle v7 = new Vehicle("Dacia",2017);
        Storage<Vehicle> storage1 = new Storage<>();
        storage1.addItem(v1);
        storage1.addItem(v2);
        storage1.addItem(v3);
        storage1.addItem(v4);
        storage1.addItem(v5);
        storage1.addItem(v6);
        storage1.addItem(v7);
        Storage<Vehicle> storage2 = new Storage<>();
        storage2.addItem(v1);
        storage2.addItem(v2);
        storage2.addItem(v5);
        storage2.addItem(v7);
        Storage<Vehicle> storage3 = new Storage<>();
        storage3.addItem(v2);
        storage3.addItem(v3);
        storage3.addItem(v6);
        Storage<Vehicle> storage4 = new Storage<>();
        storage4.addItem(v1);
        storage4.addItem(v2);
        storage4.addItem(v3);
        storage4.addItem(v4);
        storage4.addItem(v5);
        storage4.addItem(v6);
        storage4.addItem(v7);
        storage4.addItem(v3);
        storage4.addItem(v6);
        storage4.addItem(v5);

        Warehouse<Vehicle> warehouse = new Warehouse<>();
        warehouse.addStorage(storage1);
        warehouse.addStorage(storage2);
        warehouse.addStorage(storage3);
        warehouse.addStorage(storage4);
        System.out.println(warehouse.allObjectsNumber());

        List<Vehicle> vehicles = new LinkedList<>();
        Car c1 = new Car("Volga", 1986, "petrol");
        Car c2 = new Car("Mercedes", 2020, "diesel");
        Car c3 = new Car("Toyota", 2021, "diesel");
        Car c4 = new Car("Volvo", 2010, "diesel");
        Car.copyVehicles(storage4.getItems(),vehicles);
        vehicles.add(c1);
        vehicles.add(c2);
        vehicles.add(c3);
        vehicles.add(c4);

        List<Vehicle> vehicles1 = new LinkedList<>(FilterUtils.filter(vehicles,(e -> e.getYear() > 2018)));
        System.out.println("--------------");
        for(Vehicle v : vehicles1){
            System.out.println(v);
        }
    }
}
