package homework_nr_7;

public class Motorcycle extends Vehicle{
    private double engineCapacity;
    private boolean hasABS;
    @Override
    public void displayInfo(){
        System.out.println("Brand of vehicle is: " + brand);
        System.out.println("Model of vehicle is: " + model);
        System.out.println("Production year of vehicle is: " + year);
        System.out.println("Engine capacity is " + engineCapacity);
        System.out.println("This motorcycle " + (hasABS ? "has" : "doesn't have") + " ABS");
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public boolean isHasABS() {
        return hasABS;
    }

    public void setHasABS(boolean hasABS) {
        this.hasABS = hasABS;
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Motorcycle m1 = new Motorcycle();
        c1.setBrand("Tesla");
        c1.setModel("Model S");
        c1.setYear(2023);
        c1.setNumberOfDoors(4);
        c1.setElectric(true);
        m1.setBrand("Yamaha");
        m1.setModel("YZF-R3");
        m1.setYear(2021);
        m1.setEngineCapacity(321);
        m1.setHasABS(true);
        System.out.println("--------------");
        c1.displayInfo();
        System.out.println("--------------");
        m1.displayInfo();
    }
}
