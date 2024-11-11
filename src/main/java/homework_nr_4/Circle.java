package homework_nr_4;

public class Circle {
    float radius;
    public Circle(float radius){
        this.radius = radius;
    }
    public float calculateArea() {
        return (float) (3.14159 * radius * radius);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println(circle.calculateArea());
    }
}
