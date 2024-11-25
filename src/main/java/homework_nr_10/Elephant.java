package homework_nr_10;

public class Elephant extends Erbivor implements Animal{
    private final String name;
    protected boolean stuck;
    protected boolean hasAir;
    protected boolean hasFood;
    protected boolean isHungry;

    public Elephant(String name) {
        this.name = name;
    }

    protected void step(){
        System.out.println(name + " the elephant is stepping.");
    }

    @Override
    public boolean move() {
        if(stuck)return false;
        step();
        return true;
    }

    @Override
    public void born() {
        System.out.println(name + " the elephant is born.");
    }

    @Override
    public boolean breathe() {
        if(hasAir) {
            System.out.println(name + " the elephant is breathing.");
            return true;
        }
        Animal.die(name + " the elephant");
        return false;
    }

    @Override
    public boolean eat() {
        if(isHungry)
            if(hasFood) {
                System.out.println(name + " the elephant is eating.");
                return true;
            }
            else Animal.die(name + " the elephant");
        return false;
    }

    @Override
    public String species() {
        return "elephant";
    }

    public void setStuck(boolean stuck) {
        this.stuck = stuck;
    }

    public void setHasAir(boolean hasAir) {
        this.hasAir = hasAir;
    }

    public void setHasFood(boolean hasFood) {
        this.hasFood = hasFood;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public static void main(String[] args) {
        Animal El1 = new Elephant("Tom");
        ((Elephant)El1).setHasAir(true);
        ((Elephant)El1).setHungry(true);
        ((Elephant)El1).setHasFood(true);
        El1.born();
        El1.breathe();
        El1.eat();
        El1.move();
        System.out.println("The object is " + El1.species());
        System.out.println("The object is " + ((Elephant)El1).species());
        System.out.println("The object is " + ((Animal)El1).species());
        Animal.die("Someone animal");
        System.out.println("\n");
        Erbivor El2 = new Elephant("Bob");
        El2.findFood();
        El2.putString();
    }

    @Override
    public void findFood() {
        while (true){
            System.out.println(name + (stuck?" is":" isn't") + " stuck and " + (hasFood?"has":"doesn't have") + " food.");
            if(hasFood)return;
            if(move())setHasFood(Math.random() >= 0.5);
            setStuck(Math.random() >= 0.5);
        }
    }
}
