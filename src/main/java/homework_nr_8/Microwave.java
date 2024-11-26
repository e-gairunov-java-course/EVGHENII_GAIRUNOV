package homework_nr_8;

public class Microwave extends Appliance{
    private boolean hasGrill;

    public Microwave(String brand, int power, boolean hasGrill) {
        super(brand, power);
        this.hasGrill = hasGrill;
    }

    @Override
    public String turnOn() {
        return "Microwave is now heating food.";
    }

    public boolean isHasGrill() {
        return hasGrill;
    }

    public void setHasGrill(boolean hasGrill) {
        this.hasGrill = hasGrill;
    }

    public static void main(String[] args) {
        WashingMachine w1 = new WashingMachine("LG", 2000, 7.5);
        Microwave m1 = new Microwave("Samsung", 1200, true);
        Appliance[] appliances = new Appliance[]{w1,m1};
        for(int i = 0; i < appliances.length; i++){
            System.out.println("-----------");
            appliances[i].displayInfo();
            if(appliances[i] instanceof WashingMachine){
                System.out.println("This is a washing machine with a load capacity of " + ((WashingMachine)appliances[i]).getLoadCapacity() + " kg.");
            }
            if(appliances[i] instanceof Microwave){
                System.out.println("This is a microwave with" + (((Microwave)appliances[i]).isHasGrill() ? "" : "out") + " a grill.");
            }
        }
    }
}
