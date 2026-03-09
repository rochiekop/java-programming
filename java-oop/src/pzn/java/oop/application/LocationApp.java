package pzn.java.oop.application;

import pzn.java.oop.data.City;
import pzn.java.oop.data.Location;

public class LocationApp {
    public static void main(String[] args) {
        City city = new City();
        city.name = "Jakarta";
        System.out.println(city.name);
    }
}
