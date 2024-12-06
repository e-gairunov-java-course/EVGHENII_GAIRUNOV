package homework_nr_13;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private final String name;
    private final double price;
    private final Category category;

    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public String toString(){
        return name + "(" + category + ") costs " + price;
    }

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>(initPL());
        System.out.println("---Products cost more than 50:");
        System.out.println(productList.stream().filter(e -> e.price > 50).map(e -> e.name).toList());

        System.out.print("\nThe most expensive product is ");
        System.out.println(productList.stream().filter(e -> e.getCategory() == Category.ELECTRONICS)
                .reduce((Product o1, Product o2) -> o1.getPrice() > o2.getPrice() ? o1 : o2)
                .map(Product::getName).orElse("no product"));

        System.out.print("\nThe quantity of food products is ");
        System.out.println(productList.stream().filter(e -> e.getCategory() == Category.FOOD).count());

        System.out.println("\nThere " + ((productList.stream().anyMatch(e -> e.getPrice() < 20))
                ? "are products" : "isn't any product") + " cheaper than 20.");
    }

    static ArrayList<Product> initPL(){
        Product a0 = new Product("bread", 5.6, Category.FOOD);
        Product a1 = new Product("butter", 43.5, Category.FOOD);
        Product a2 = new Product("milk", 17.3, Category.FOOD);
        Product a3 = new Product("eggs", 34.6, Category.FOOD);
        Product a4 = new Product("coat", 2900, Category.CLOTHING);
        Product a5 = new Product("boots", 1400, Category.CLOTHING);
        Product a6 = new Product("hat", 78, Category.CLOTHING);
        Product a7 = new Product("clock", 235, Category.ELECTRONICS);
        Product a8 = new Product("radio", 370, Category.ELECTRONICS);
        Product a9 = new Product("camera", 4500, Category.ELECTRONICS);
        return new ArrayList<>(List.of(a0,a1,a2,a3,a4,a5,a6,a7,a8,a9));
    }
}
