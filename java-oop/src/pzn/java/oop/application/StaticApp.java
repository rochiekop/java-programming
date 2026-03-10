package pzn.java.oop.application;

import pzn.java.oop.data.Application;
import static pzn.java.oop.data.Constant.*;
import pzn.java.oop.data.Country;

import pzn.java.oop.utils.MathUtils;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);


        System.out.println(MathUtils.sum(1,4,5,6,6));

        Country.City city = new Country.City();
        city.setName("Bandung");
        System.out.println(city.getName());


        System.out.println(Application.PROCESSORS);
    }
}
