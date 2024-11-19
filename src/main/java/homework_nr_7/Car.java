package homework_nr_7;

public class Car extends Vehicle{
    private int numberOfDoors;
    private boolean isElectric;
    @Override
    public void displayInfo(){
        System.out.println("Brand of vehicle is: " + brand);
        System.out.println("Model of vehicle is: " + model);
        System.out.println("Production year of vehicle is: " + year);
        System.out.println("Number of doors is: " + numberOfDoors);
        System.out.println("This car is " + (isElectric ? "" : "not ") + "electric");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}
