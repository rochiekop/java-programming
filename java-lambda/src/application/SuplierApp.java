package application;

import java.util.function.Supplier;

public class SuplierApp {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Eko Pambudi";

        System.out.println(supplier.get());
    }
}
