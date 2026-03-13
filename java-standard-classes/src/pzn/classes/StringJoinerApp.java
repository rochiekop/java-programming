package pzn.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(":","[","]");
        joiner.add("Eko").add("Pambudi");

        System.out.println(joiner);

        String value = joiner.toString();
        System.out.println(value  );

    }
}
