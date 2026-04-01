package application;

import generic.MyData;

import java.util.Objects;

public class InvariantApp {
    /**
     *
     * There is no relations in generic to polymorphism;
     */
    public static void main(String[] args) {
        MyData<String> myData = new MyData<>("Eko");
        //doIt(myData); //Error
        //MyData<Objects> objectsMyData= myData; //Error

        MyData<Object> objectsMyData = new MyData<>(1000);
        //doItInt(objectsMyData); //Error
        //MyData<Integer> integerMyData = objectsMyData; //Error

    }

    public static void doIt(MyData<Objects> app){
        //do nothing
    }

    public static void doItInt(MyData<String> data){};
}
