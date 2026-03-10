package pzn.java.oop.utils;

public class MathUtils {
    public static int sum(int... values){
        int total = 0;
        for (var value : values){
            total +=value;
        }
        return total;
    }
}
