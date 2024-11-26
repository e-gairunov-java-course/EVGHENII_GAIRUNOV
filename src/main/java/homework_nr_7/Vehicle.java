package homework_nr_7;

public class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    public void displayInfo(){
        System.out.println("Brand of vehicle is: " + brand);
        System.out.println("Model of vehicle is: " + model);
        System.out.println("Production year of vehicle is: " + year);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
