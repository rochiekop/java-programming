package application;

import java.util.function.Supplier;

public class LazzyApp {
    public static void main(String[] args) {
        testScore(()->getName(), 78);
    }


    public static void testScore(Supplier<String> name, Integer value){
        if (value > 80){
            System.out.println("Pass "+name.get() +" with value "+value);
        }else{
            System.out.println("Sorry you didn't pass");
        }
    }


    public static String getName(){
        System.out.println("Call function getName()");
        return "Eko";
    }
}
