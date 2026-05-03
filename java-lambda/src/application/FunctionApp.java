package application;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        Function<String, Integer> function = s -> s.length();

        System.out.println(function.apply("Eko Pambudi"));
    }
}
