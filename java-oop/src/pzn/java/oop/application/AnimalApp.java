package pzn.java.oop.application;

import pzn.java.oop.annotation.Fancy;
import pzn.java.oop.data.Cat;

@Fancy(name = "Animal", tags = {"Application","Java"})
public class AnimalApp {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Meow";
        cat.run();

    }
}
