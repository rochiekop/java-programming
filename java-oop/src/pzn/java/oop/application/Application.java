package pzn.java.oop.application;

import pzn.java.oop.data.*;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Macbook pro M4",30_000_000);
        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();
    }
}
