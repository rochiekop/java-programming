package pzn.classes;

public class NumberApp {
    public static void main(String[] args) {
        Integer integerNumber = 1_000_000;

        Long longNumber = integerNumber.longValue();
        Byte byteNumber = longNumber.byteValue();
        Short shortNumber = integerNumber.shortValue();

        System.out.println(longNumber);
        System.out.println(byteNumber);

        Double doubleNumber = byteNumber.doubleValue();
        System.out.println(doubleNumber);

        String example = "1000000000";

        /**
         * valueOf to return non primitive
         * parseOf to return primitive
         */
        Integer integerExample = Integer.valueOf(example);

        int intExample = Integer.parseInt(example);

        System.out.println(integerExample);
        System.out.println(intExample);
    }
}
