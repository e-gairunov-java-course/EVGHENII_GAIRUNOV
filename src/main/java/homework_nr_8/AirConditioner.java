package homework_nr_8;

public class AirConditioner extends Appliance{
    private int coolingPower;
    private boolean hasInverter;

    public AirConditioner(String brand, int power, int coolingPower, boolean hasInverter) {
        super(brand, power);
        this.coolingPower = coolingPower;
        this.hasInverter = hasInverter;
    }

    @Override
    public String turnOn() {
        return "Air conditioner is now cooling the room.";
    }

    public int getCoolingPower() {
        return coolingPower;
    }

    public void setCoolingPower(int coolingPower) {
        this.coolingPower = coolingPower;
    }

    public boolean isHasInverter() {
        return hasInverter;
    }

    public void setHasInverter(boolean hasInverter) {
        this.hasInverter = hasInverter;
    }

    @Override
    public void displayInfo(){
        System.out.println("The brand of the air conditioner is " + brand + ".");
        System.out.println("Power consumption of the air conditioner is " + power + " W.");
        System.out.println("Cooling power of this air conditioner is " + coolingPower + " BTU.");
        System.out.println("This air conditioner " + (hasInverter ? "has" : "doesn't have") + " inverter.");
        System.out.println(this.turnOn());
    }

    public static void main(String[] args) {
        WashingMachine w1 = new WashingMachine("LG", 2000, 7.5);
        Microwave m1 = new Microwave("Samsung", 1200, true);
        AirConditioner a1 = new AirConditioner("Daikin", 1500, 12000, true);
        Appliance[] appliances = new Appliance[]{w1,m1,a1};
        for(int i = 0; i < appliances.length; i++){
            System.out.println("-----------");
            appliances[i].displayInfo();
            if(appliances[i] instanceof WashingMachine){
                System.out.println("This is a washing machine with a load capacity of " + ((WashingMachine)appliances[i]).getLoadCapacity() + " kg.");
            }
            if(appliances[i] instanceof Microwave){
                System.out.println("This is a microwave with" + (((Microwave)appliances[i]).isHasGrill() ? "" : "out") + " a grill.");
            }
            if(appliances[i] instanceof AirConditioner){
                System.out.println("This is an air conditioner with cooling power of " + ((AirConditioner)appliances[i]).getCoolingPower() +
                        " BTU and " + (((AirConditioner)appliances[i]).isHasInverter() ? "has" : "doesn't have") + " inverter.");
            }
        }
    }
}
