package homework_nr_17;

import java.util.List;

public class Car extends Vehicle{
    private final String fuelType;

    public Car(String model, int year, String fuelType) {
        super(model, year);
        this.fuelType = fuelType;
    }

    public String toString(){
        return super.toString() + ", Тип топлива: " + fuelType;
    }

    public static void copyVehicles(List<? extends Vehicle> source, List<? super Vehicle> destination){
        destination.addAll(source);
    }
}
