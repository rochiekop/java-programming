package collection;

import java.util.Arrays;
import java.util.EnumSet;

public class EnumSetApp {
    public static void main(String[] args) {
        //EnumSet<Gender> genders = EnumSet.allOf(Gender.class);
        EnumSet<Gender> genders = EnumSet.of(Gender.FEMALE,Gender.MALE);
        System.out.println(genders);

        Gender[] values = Gender.values();
        System.out.println(Arrays.toString(values));
    }

    public static enum Gender{
        MALE,FEMALE, NOT_MENTIONS
    }
}
