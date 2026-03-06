public class TipeDataNumber {
    public static void main(String[] args) {
        byte thisIsByte = 10;
        short thisIsShort = 1000;
        int thisIsInt = 1_000_000;
        long thisIsLong = 100_000_000;
        long thisIsLong2 = 100_000_000L;

        float thisIsFloat = 10.10F;
        double thisIsDouble = 100.10;

        /*Literal Number*/
        int decimalInt = 100;
        int hexDecimal = 0xFFFF;
        int binDecimal = 0b010010;

        int sum = thisIsByte + thisIsByte;
        System.out.println("Number of sum "+ sum);
    }
}
