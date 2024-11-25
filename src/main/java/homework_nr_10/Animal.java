package homework_nr_10;

public interface Animal {
    boolean move();
    void born();
    boolean breathe();
    boolean eat();
    static void die(String name){
        System.out.println(name + " is dying.");
    }
    default String species(){
        return "animal";
    }
}
