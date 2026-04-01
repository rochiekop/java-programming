package application;

import util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] arrString = {"Eko","Pambudi"};
        Integer[] arrInteger = {1,3,4,6,7,4};

        System.out.println(ArrayHelper.count(arrString));
        System.out.println(ArrayHelper.count(arrInteger));
    }
}
