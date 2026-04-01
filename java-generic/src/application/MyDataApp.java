package application;

import generic.MyData;

public class MyDataApp {
    public static void main(String[] args) {
        MyData<String> myData = new MyData<String>();
        myData.setData("Eko");
        System.out.println(myData.getData());

        MyData<Integer> myData1 = new MyData<Integer>();

        myData1.setData(1000);
        System.out.println(myData1.getData());
    }
}
