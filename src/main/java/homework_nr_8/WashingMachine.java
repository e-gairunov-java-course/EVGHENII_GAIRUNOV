package homework_nr_8;

public class WashingMachine extends Appliance{
    private double loadCapacity;

    public WashingMachine(String brand, int power, double loadCapacity) {
        super(brand, power);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String turnOn() {
        return "Washing machine is now washing clothes.";
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
