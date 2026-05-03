package application;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.isBlank();
            }
        };

        System.out.println(predicate.test(""));
        System.out.println(predicate.test("Eko Pambudi"));
    }
}
