package application;

import util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
        //Predicate<String> predicate = s -> StringUtil.isLowerCase(s);
        Predicate<String> predicate = StringUtil::isLowerCase;

        System.out.println(predicate.test("Eko Pambudi"));
        System.out.println(predicate.test("rochi"));


        // Method Reference di Parameter

        // Function<String, String> functionUpper = (String value) -> value.toUpperCase();
        Function<String, String> functionUpper = String::toUpperCase;

        System.out.println(functionUpper.apply("Eko"));

    }

    public void run(){
        //Predicate<String> predicate = s -> StringUtil.isLowerCase(s);
        Predicate<String> stringPredicate = this::isLowerCase;

        System.out.println(stringPredicate.test("Eko Pambudi"));
        System.out.println(stringPredicate.test("rochi"));
    }


    public void run2(){
        //Predicate<String> predicate = s -> StringUtil.isLowerCase(s);
        MethodReferenceApp app = new MethodReferenceApp();

        Predicate<String> stringPredicate = app::isLowerCase;

        System.out.println(stringPredicate.test("Eko Pambudi"));
        System.out.println(stringPredicate.test("rochi"));
    }


    public boolean isLowerCase(String value){
        for(var e : value.toCharArray()){
            if(!Character.isLowerCase(e)){
                return false;
            }
        }
        return true;
    }
}
