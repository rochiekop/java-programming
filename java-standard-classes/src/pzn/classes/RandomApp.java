package pzn.classes;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            System.out.println("Iteration :"+ (i+1) +" Random number "+random.nextInt(1000));
        }

    }
}
