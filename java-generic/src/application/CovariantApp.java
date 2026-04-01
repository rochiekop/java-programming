package application;

import generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> myData = new MyData<>("Eko");
        process(myData);

        MyData<Integer> myData1 = new MyData<>(10000);
        process(myData1);


        MyData<? extends Object> myData2= new MyData<>("Pambudi");
        System.out.println(myData2.getData());

    }

    public static void process(MyData<? extends Object> data){
        System.out.println(data.getData());

        /**
         * In Generic we only can use getter instead of setter because it can change the type of param;
         */
    }
}
