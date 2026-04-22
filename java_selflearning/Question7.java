import java.util.*;

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {

        HashMap<Integer, Product> products = new HashMap<>();
        products.put(1, new Product(1, "Laptop", 50000));
        products.put(2, new Product(2, "Phone", 20000));

        ArrayList<Product> cart = new ArrayList<>();

        cart.add(products.get(1));
        cart.add(products.get(2));

        double total = 0;
        for (Product p : cart) {
            System.out.println(p.name + " - " + p.price);
            total += p.price;
        }

        System.out.println("Total = " + total);
    }
}
