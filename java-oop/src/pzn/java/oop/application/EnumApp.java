package pzn.java.oop.application;

import pzn.java.oop.data.Customer;
import pzn.java.oop.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Echo");
        customer.setLevel(Level.STANDAR);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.PREMIUM.name();
        System.out.println(levelName);

        Level level = Level.valueOf("VIP");
        System.out.println(level);

        Level[] levelArr = Level.values();
        System.out.println(levelArr);

        for (var arr : levelArr){
            System.out.println(arr);
        }



    }
}
