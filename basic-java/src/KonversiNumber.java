public class KonversiNumber {
    public static void main(String[] args) {
        /* Widening Casting */
        byte thisIsByte = 10;
        short thisIsShort = thisIsByte;
        int thisIsInt = thisIsShort;
        long thisIsLong = thisIsInt;

        float thisIsFloat = thisIsLong;
        double thisIsDouble = thisIsFloat;

        /*
        Narrowing Casting
        should be aware : IT CAN BE OCCURS NUMBERS OF OVERFLOW
        */
        int thisIsInt2 = 1000;
        short thisIsShort2 = (short) thisIsInt2;

        System.out.println(thisIsShort2);
    }

}
