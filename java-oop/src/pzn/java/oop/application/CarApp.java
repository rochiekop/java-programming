package pzn.java.oop.application;

import pzn.java.oop.data.Avanza;
import pzn.java.oop.data.Bus;
import pzn.java.oop.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        car.drive();
        System.out.println(car.getTire());
        System.out.println(car.getBrand());
        System.out.println(car.isMaintenance());

        Car bus = new Bus();
        bus.drive();
        System.out.println(bus.getTire());
        System.out.println(bus.getBrand());
        System.out.println(bus.isMaintenance());
        System.out.println(bus.isBig());
    }
}
