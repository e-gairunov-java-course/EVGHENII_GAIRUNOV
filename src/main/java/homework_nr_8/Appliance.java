package homework_nr_8;

public abstract class Appliance {
    protected String brand;
    protected int power;

    public Appliance(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    public abstract String turnOn();
    public void displayInfo(){
        System.out.println("The brand of the appliance is " + brand + ".");
        System.out.println("Power consumption of the appliance is " + power + " W.");
        System.out.println(this.turnOn());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
