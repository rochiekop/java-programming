package pzn.java.oop.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Macbook Pro", 30_000_000);
        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println(product);


        Product product1 = new Product("Macbook Pro", 30_000_000);
        System.out.println(product1);

        System.out.println(product.equals(product1));
        System.out.println(product.hashCode() == product1.hashCode());
    }
}
