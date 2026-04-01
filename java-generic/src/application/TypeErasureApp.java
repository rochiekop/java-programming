package application;

import generic.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {
        MyData stringMyData = new MyData("Eko");//ERROR
        //MyData<String> stringMyData = new MyData<String>("Eko");


        MyData<Integer> integerMyData = (MyData<Integer>) stringMyData;

        Integer integer = integerMyData.getData();
    }
}
