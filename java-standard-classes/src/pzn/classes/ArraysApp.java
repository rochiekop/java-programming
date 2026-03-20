package pzn.classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] array = {
                1,2,43,55,22,53,63,23,5,10
        };

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


        System.out.println(Arrays.binarySearch(array,63));
        System.out.println(Arrays.binarySearch(array,1000));

        int[] result = Arrays.copyOf(array,5);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(array,5,10);
        System.out.println(Arrays.toString(result2));
    }
}
