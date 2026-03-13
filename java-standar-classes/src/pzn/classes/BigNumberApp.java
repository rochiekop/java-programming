package pzn.classes;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {
        BigInteger bigInteger1 = new BigInteger("100000000000000000000000");
        BigInteger bigInteger2 = new BigInteger("100000000000000000000000");

        BigInteger a = bigInteger1.add(bigInteger2);
        System.out.println(a);


    }
}
