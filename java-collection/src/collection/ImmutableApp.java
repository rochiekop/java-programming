package collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {
        List<String> one = Collections.singletonList("One");
        List<String> emptyList = Collections.emptyList();
        List<String> mutable = new ArrayList<>();

        mutable.add("EKo");
        mutable.add("Pambudi");


        List<String> immutable = Collections.unmodifiableList(mutable);
        List<String> elements = List.of("Eko","Pambudi");

        System.out.println(mutable);
        System.out.println(emptyList);
        System.out.println(one);
    }
}
