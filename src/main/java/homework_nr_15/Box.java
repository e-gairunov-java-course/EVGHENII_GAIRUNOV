package homework_nr_15;

public class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public static void main(String[] args) {
        Box<Integer> box = new Box<>(100);
        System.out.println("Box contains " + box.getContent());
        box.setContent(200);
        System.out.println("Box contains " + box.getContent());
        Box<String> box1 = new Box<>("Generics are useful!");
        System.out.println(box1.getContent());
    }
}
